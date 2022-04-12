//642115022
//thanapong

import java.util.List;
import java.util.Random;

public class Mian {
    public static void main(String[] args) {
        Vaccinelist mainlist = new Vaccinelist();

        //insert 10 people
        mainlist.insert(new CovidVaccineData(1, "misterA", "A", new String[]{"Pfizer"} ,"1 jan 2021"));
        mainlist.insert(new CovidVaccineData(2, "misterB", "B", new String[]{"Moderna"}, "2 jan 2021"));
        mainlist.insert(new CovidVaccineData(3, "misterC", "C", new String[]{"Sinovac"}, "3 jan 2021"));
        mainlist.insert(new CovidVaccineData(4, "misterD", "D", new String[]{"Novavax"}, "4 jan 2021"));
        mainlist.insert(new CovidVaccineData(5, "misterE", "E", new String[]{"Johnson & Johnson"}, "5 jan 2021"));
        mainlist.insert(new CovidVaccineData(6, "misterF", "F", new String[]{"Sputnik V"}, "6 jan 2021"));
        mainlist.insert(new CovidVaccineData(7, "misterG", "G", new String[]{"Aztrazeneca"}, "7 jan 2021"));
        mainlist.insert(new CovidVaccineData(8, "misterH", "H", new String[]{"Sinophan"}, "8 jan 2021"));
        mainlist.insert(new CovidVaccineData(9, "misterI", "I", new String[]{"Moderna"}, "9 jan 2021"));
        mainlist.insert(new CovidVaccineData(10, "misterJ", "J", new String[]{"Pfizer"}, "10 jan 2021"));

        //print first result
        mainlist.traversalall();
        System.out.println("====================================================================================================================");

        //randomdelete 2 people
        Random r = new Random();
        mainlist.delete(r.nextInt(mainlist.getSize()));
        mainlist.delete(r.nextInt(mainlist.getSize()));

        //print second result
        mainlist.traversalall();
        System.out.println("====================================================================================================================");
        //check people
        mainlist.traversal(5);
        System.out.println("====================================================================================================================");

        //delete all people 
        mainlist.deleteall();

        System.out.println("====================================================================================================================");

        //print final result
        mainlist.traversalall();

    }
    
}