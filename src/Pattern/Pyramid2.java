package Pattern;
import java.util.Scanner;

public class Pyramid2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for (int i= 1; i<= N; i++) {
            for(int  j =1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
