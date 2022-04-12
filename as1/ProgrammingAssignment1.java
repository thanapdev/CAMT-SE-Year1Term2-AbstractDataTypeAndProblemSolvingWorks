package as1;

import java.io.*;
import java.util.*;
import java.util.Vector;

//Created by 642115017 DUSIT CHUNVISET
public class ProgrammingAssignment1 {
    public static void main(String[] args) throws FileNotFoundException {

        System.setProperty("file.encoding", "UTF-8");
        // Import File
        File fileName = new File("imformation.csv");
        Scanner scan = new Scanner(fileName);

        for (int i = 0; i < 1; i++) {
            scan.nextLine();
        }

        Vector<Student> student = new Vector<Student>();

        while (scan.hasNextLine()) {
            String dataLine = scan.nextLine();
            StringTokenizer stu = new StringTokenizer(dataLine.trim(),",");
            Student read = new Student(stu.nextToken(), stu.nextToken(), stu.nextToken(), stu.nextToken());
            student.addElement(read);
        }

        scan.close();

        quickSort(student, 0, student.size());
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.elementAt(i).toString());
        }
    }

    public static void quickSort(Vector<Student> student, int l, int r) {
        if (l >= r)
            return ;

        int p = part(student, l, r);
        quickSort(student, p + 1, r);
        quickSort(student, l, p);
    } 

    public static int part(Vector<Student> student, int l, int r) {
        int i = l - 1;
        int pivot = r - 1;
        for (int j = l; j < r - 1; j++) {
            if (student.elementAt(j).getLastName().charAt(0) < student.elementAt(pivot).getLastName().charAt(0)) {
                i++;
                Collections.swap(student, i, j);
            }
        }
        Collections.swap(student, pivot, i + 1);
        return i + 1 ;
    }
}
