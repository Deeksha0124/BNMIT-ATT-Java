package Day3;
import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                //shift operation - in order to compare coz nothing is there before the first value, so we shift by 1 index from there we start comparing
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp; //fill the space with the temporary value
        }
    }
    public static void main(String[] args){
        int[] arr = {56,23,1,5,6,7,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
