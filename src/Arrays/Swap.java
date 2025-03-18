package Arrays;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,58,45,3,49,48,7,452,45,242,};
        swap(arr , 1,5);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index, int index2) {
        int temp = arr[index];
        arr[index] = arr[index2];
        arr[index2] = temp;
    }

}
