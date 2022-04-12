//thanapong yamkamol
//642115022

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class workshop2 {


    public static void main(String[] args)throws FileNotFoundException{
        double[] cTotal = new double[2];
        cTotal = mySearch();
        System.out.println("total : " + cTotal[0]);
        System.out.println("more than 0.5 : " +cTotal[1]);
    }

    public static double[] mySearch()throws FileNotFoundException {

        File fileData = new File("D:/WORKS/adt/workshop2/data.txt");
        Scanner read = new Scanner(fileData);
        int counttotalnumber = 0;
        int countmorepointfive = 0;

        while(read.hasNext()) {
            double data = read.nextDouble();
            counttotalnumber++;
            if (data > 0.5) {
                countmorepointfive++;
            }
        }

        double[] array = new double[2];
        array[0] = counttotalnumber;
        array[1] = countmorepointfive;

        return array;
    }
    
}