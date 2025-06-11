package Day7.GreedyAlgos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public static int findMinDiff(ArrayList<Integer> arr, int m) {
        if(m == 0 || arr.size() < m){  //if no. of chocos is less than no. of students, we cant distribute , so return 0
            return 0;
        }
        Collections.sort(arr);
        int minDiff = Integer.MAX_VALUE; //initially take a very large value

        //sliding window
        for(int i = 0; i + m - 1 < arr.size(); i++){
            int diff = arr.get(i + m - 1) - arr.get(i);
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        // Initialize the ArrayList with chocolate packets
        ArrayList<Integer> arr = new ArrayList<>(List.of(3, 4, 1, 9, 56, 7, 9, 12));
        int m = 5; // Number of students

        // Call the function and display the result
        int result = findMinDiff(arr, m);
        System.out.println("Minimum difference is: " + result);
    }
}
