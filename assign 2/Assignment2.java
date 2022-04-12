import java.io.File;
import java.io.FileNotFoundException;

public class Assignment2 {
    public static void main(String[] args) throws FileNotFoundException {
        Long start = System.nanoTime();
        System.setProperty("file.encoding", "UTF-8");
        File file = new File(args[0]);

        Document doc = new Document(file);
        System.out.println("Total char count: "+doc.getCharCount());
        System.out.println("Total palindrome count: "+doc.getPalinCount());
        System.out.println("Total token count: "+doc.getTokenCount());
        System.out.println("Total line count: "+doc.getLineCount());
        System.out.println("Longest token size: "+doc.getLongToken());
        System.out.println("Average token size: "+doc.getAvgToken());
        Long end = System.nanoTime();
        System.out.println("Time taken: "+(end-start)/1000000+" millisecond");
        System.out.println("Program terminated properly!");
    }
}