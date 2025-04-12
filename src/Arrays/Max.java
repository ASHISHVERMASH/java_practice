package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {45,89,47,59,25,48,75};
        int max = 0;

        for(int i =0;i<arr.length;i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("maxium "  + max);
    }
}
