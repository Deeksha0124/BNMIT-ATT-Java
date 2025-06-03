public class RecursiveBinary {
    public static int recursiveBinary(int[] arr, int key, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == key) {
            return mid;
        }
        else if(arr[mid] < key){
            return recursiveBinary(arr, key, mid + 1,end);
        }
        else{
            return recursiveBinary(arr, key, start, mid - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,43,89,100};
        System.out.println(recursiveBinary(arr,43,0, arr.length-1));
    }
}
