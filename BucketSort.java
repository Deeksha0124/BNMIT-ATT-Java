import java.util.Arrays;

public class BucketSort {
    public static void bucketSort(int[] arr) {
        int max = getMax(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }
    private static int getMax(int[] arr) {
        //step 1: find the max
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    private static void countSort(int[] arr, int exp){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];//0-9 = 10 elements
        //Count the number of occurrences for each elements
        for(int i = 0; i < n; i++){
            int digit = (arr[i]/exp) % 10; // 325/1 = 325 % 10 = 5
                count[digit]++;
            }
        //cumulative count
        //skip index 0
        for(int i=1; i<10; i++){
            //curr = curr + prev
            count[i] +=  count[i-1];
        }
        for(int i=n-1; i>=0; i--){
            int digit = (arr[i]/exp) % 10;
//            output[count[digit]-1] = arr[i];
//            count[digit]--;
//            (or)
            output[--count[digit]] = arr[i];
        }
        for(int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {325,3,246,192,5};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
