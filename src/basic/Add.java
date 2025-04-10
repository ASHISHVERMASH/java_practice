package basic;
import java.util.Scanner;

class Algebra{
    int add(int a , int b) {
        int ans = a+b;
        return ans;
    }
}

public class Add {
    public static void main(String[] args) {
        Algebra  obj = new Algebra();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = obj.add(a,b);
        System.out.println(ans);


    }
}
