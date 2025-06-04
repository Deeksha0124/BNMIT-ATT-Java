package Day2;
import java.util.Arrays;

public class CountSortAlgo{
    public static void countSort(int[] arr){
        //step 1: find the max
        int k = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > k){
                k = arr[i];
            }
        }
        //step 2: create a count array
        int[] count = new int[k+1];

        //step 3: calculate the frequency of each element
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++ ;
        }
        //step 4: calculate the cumulative count
        //c = c + p
        //skip index 0 and go till max because index 0 has no prev index
        for(int i = 1; i<=k; i++){
            count[i] += count[i-1];
        }
        //step 5: create the output array
        int[] output = new int[arr.length];
        //start from the end of the array -> R to L
        for(int i = arr.length-1; i>=0; i--){
            output[--count[arr[i]]] = arr[i];
        }
        //copy the output back to the input
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = output[i];
//        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args){
        int[] arr = {6,4,3,4,1,3,2,3,1};
        System.out.println("Before Sorting Array: ");
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println("After Sorting Array: ");
        System.out.println(Arrays.toString(arr));

    }
}