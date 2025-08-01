package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class listPractice {
    public static void main(String[] args) {
        List<String> medicine = new ArrayList<>();
        //add
        medicine.add("paracetamol");
        medicine.add("dispirin");
        medicine.add("painKiller");
        medicine.add("ultrashiled");
        System.out.println(medicine);
/*
   for each
        for(String Char: medicine){
            System.out.println(Char);

}*/

      /*  iteration
        for (int i = 0; i < medicine.size() ; i++) {
            System.out.println(medicine.get(i));
        }*/

     //size
        System.out.println(medicine.size());

        // get
        System.out.println(medicine.get(1));

        //remove
     medicine.remove(0);
        System.out.println(medicine);

        // contains
        System.out.println(medicine.contains("paracetamol"));

        //set
       medicine.set(0,"paracetamol");
        System.out.println(medicine);

        //clear
        medicine.clear();
        System.out.println(medicine);


    }
}
