//thanapong yamkamol
//642115022 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class runitplz {
    public static void main(String[] args)throws FileNotFoundException {
        long startTime = System.nanoTime();

        File file = new File("input1.txt");
        Scanner scannerkun = new Scanner(file);
        
        int countline = 0;
        int countword = 0;
        int countchar = 0;
        int countpalin = 0;

        Vector<String> vector = new Vector<String>();

        while (scannerkun.hasNextLine()) {
            String data = scannerkun.nextLine();
            countline += 1;

            for (String word : data.split("(\\s+)(?!\\w*?\\u005c)")) {
                vector.addElement(word);
            }

        }

        int max = vector.get(1).length();

        for (int i = 0; i < vector.size(); i++) {
            countchar += vector.get(i).length();

            max = (max < vector.get(i).length()) ? vector.get(i).length() : max;
        }

        for (int i = 0; i < vector.size(); i++) {
            countchar += vector.get(i).length();

            max = (max < vector.get(i).length()) ? vector.get(i).length() : max;

            String firstword = vector.get(i);
            String lastword = "";

            int length = vector.get(i).length();
            for (int k = length - 1; k >= 0; k--) {
                lastword = lastword + vector.get(i).charAt(k);
            }

            if (lastword.equals(vector.get(i))) {
                countpalin += 1;
            }

        }

        countword = vector.size();
        
        System.out.println("Total # Char count : "+countchar);

        System.out.println("Total Number of token : "+countword);

        System.out.println("Total # of new line : "+countline);

        System.out.println("Average Token : " + (double) countchar / (double) vector.size());

        System.out.println("The longest token : " + max);

        long endTime = System.nanoTime();
        double totalTime = endTime - startTime;

        System.out.println("Total time to execute this program " + totalTime/1000000000 + " secs");
    }
}
