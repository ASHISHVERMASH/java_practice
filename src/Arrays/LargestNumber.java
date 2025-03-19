package Arrays;
import java.util.Arrays;

public class LargestNumber {
        public static void main(String[] args)
        {

            int arr[] = {20, 10, 20, 4, 100};
            int max = Arrays.stream(arr).max().getAsInt();
            System.out.println(max);
        }

    }