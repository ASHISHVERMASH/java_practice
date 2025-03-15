package Pattern;
import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
     Scanner in =   new Scanner(System.in);
     int N = in.nextInt();
     /* concept space,star,space
       1space = n-i-1
        star = 2*i+1
        2space = n-1-1  */

        for (int i = 0; i <N ; i++) {
         //space
          for(int j =0;j<N-i-1;j++){
              System.out.print(" ");
          }
          //star
          for(int j =0;j< 2*i+1;j++){
              System.out.print("*");
          }
          //space
            for(int j =0;j<N-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
