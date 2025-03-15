package Pattern;
import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // concept = n-row+1
        int N = in.nextInt();
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N - i + 1; j++) {
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}