package Day5.NonLinearDataStructures.Trees.Heap;

import java.util.PriorityQueue;
public class kLargestElements{
    public static void klargestElements(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // 1 insert all elements from array into heap
        // 2 remove the elements exceeding the size k
    for(int num : arr){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll(); // remove the smallest if size exceeds k
            }
        }
        // 3 print the remaining k elements in the heap
    System.out.println("the " + k + " largest elements are: ");
    while(!minHeap.isEmpty()){
            System.out.println(minHeap.poll() + " ");
        }
    System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        klargestElements(arr, 3);
        System.out.println("The least element is: " + arr[0]);
    }

}
