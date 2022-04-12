import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Document {
    private int charCount = 0;
    private int lineCount = 0;
    private int tokenCount = 0;
    private int palinCount = 0;
    private int longToken = 0;
    private double avgToken = 0;
    private Vector<String> vector = new Vector<String>();

    public Document (File source) throws FileNotFoundException {
        Scanner scan = new Scanner(source);
        readFile(scan);
        checkAll();
    }

    //    ----------GETTER METHODS----------
    public int getCharCount() { return charCount;}
    public int getLineCount() { return lineCount;}
    public int getTokenCount() { return tokenCount;}
    public int getPalinCount() { return palinCount;}
    public int getLongToken() { return longToken;}
    public double getAvgToken() { return avgToken;}

    //    ----------------------------------

    /**
     * This method extracts each word from {@code scan} to {@link #vector}.
     * It counts the number of lines {@link #lineCount} that are not empty from {@code scan}.
     * @param scan Scanner class object
     */
    public void readFile(Scanner scan) {
        while (scan.hasNextLine()) {
            String data = scan.nextLine();
            lineCount++;  // Counting number of lines

            // splitting the string based on the regex "whitespace, tabs, and line breaks EXCLUDING those in directory"
            for (String word : data.split("(\\s+)(?!\\w*?\\u005c)")) {
                vector.addElement(word);
            }
        }
    }


    /**
     * This method processes every string in {@link #vector}
     * For each string, it does the following:
     * 1) Find {@link #longToken}
     * 2) Find the number of palindrome {@link #palinCount} by using {@link #isPalindrome(String)}
     * 3) Find the character count {@link #charCount}
     * 4) Find the total number of tokens in {@link #vector}
     * 5) Find the average length {@link #avgToken} of string
     */
    public void checkAll() {
        for (String word: vector) {
            if (longToken < word.length()) // Test for longest token
                longToken = word.length();
            if (isPalindrome(word))        // Test for palindrome
                palinCount++;
            charCount+=word.length();      // Add total count of characters excluding whitespace, tabs, and line breaks
            tokenCount++;                  // for counting number of tokens
        }
        avgToken = (double)charCount/(double)tokenCount;
    }

    /**
     * Check if the string is palindrome.
     * 
     * @param word  the string that we use here
     * @return {@code true} if {@code word} is a palindrome, otherwise {@code false}
     */
    public static boolean isPalindrome(String word) {
        for (int i=0;i<word.length()/2;i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}