package collectionFramework;

import java.util.Stack;

public class stackPractice {
    public static void main(String[] args) {
        Stack<String> medicine = new Stack<>();
        //add
        medicine.push("Disprin");
        medicine.push("Vitamin d");
        medicine.push("Calcium");
        medicine.push("Paracetamol");
        System.out.println(medicine);

        //remove
        medicine.pop();
        System.out.println(medicine);

        //peek
        System.out.println( medicine.peek());
    }
}
