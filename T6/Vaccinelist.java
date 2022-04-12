//642115022
//thanapong

import java.util.LinkedList;

public class Vaccinelist {
    LinkedList list = new LinkedList<CovidVaccineData>();

    public Vaccinelist() {
        
    }

    //insert data method
    public void insert(CovidVaccineData m){
        list.add(m);
    }

    //delete data method
    public void delete(int m){
        list.remove(m);
    }

    //delete all data method 
    public void deleteall(){
        list.clear();
    }

    //get array size
    public int getSize(){
        return list.size();
    }

    //check 
    public boolean isEmpty(){
        return list.size() == 0;
    }

    //check list
    public void traversalall(){
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }
    }

    //print result
    public void traversal(int travel){
        System.out.println(list.get(travel));
    } 
}
