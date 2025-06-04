package Day3;
public class QuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partitionIndex(int[] arr, int start, int end) {
        int pivot = arr[start];
        int count = 0;
        for (int i = start + 1; i <= end; i++) { // changed i < end to i <= end
            if (arr[i] < pivot) {
                count++;
            }
        }
        int pivotIndex = start + count;
        swap(arr, pivotIndex, start);

        int i = start, j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i++, j--);
            }
        }
        return pivotIndex;
    }


    public static void quickSort(int[] arr, int start, int end){
        //base case
        if(start >= end){ //single element or out of bounds, just return
            return;
        }
        //find the pivot for partition
        int p = partitionIndex(arr, start, end);
        //now use recursion to sort the left and right part of the pivot
        //left part
        quickSort(arr, start, p - 1);
        //right part
        quickSort(arr, p + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {8,4,7,3,10,2,6};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

