package Pattern;
import java.util.Scanner;

public class RightAngle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;

            int N = in.nextInt();
            for (int i=0; i<N;i++) {
                for(int j =0;j<=i;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

    }
}
