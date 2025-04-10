package Arrays;
import java.util.Scanner;

public class PairSum {
    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans =0;

        for(int i =0;i<n;i++){
            for(int  j=i+1; j<n; j++){
                if(arr[i] + arr[j] ==target ) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter  "+ n +   " element");
        for(int i  =0;i<n;i++) {
            arr[i] =  in.nextInt();
        }

        System.out.println("Enter target Sum ");
        int target =  in.nextInt();

        System.out.println(pairSum(arr,target));
    }
}
