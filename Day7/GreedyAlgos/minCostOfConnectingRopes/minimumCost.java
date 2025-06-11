package Day7.GreedyAlgos.minCostOfConnectingRopes;

import java.util.PriorityQueue;

class Solution {
    public static int minCost(int[] arr) {
        // min heap -> priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //add all the ropes to the heap
        for (int length : arr){
            pq.add(length);
        }
        int totalCost = 0;
        //continue till only one rope is left
        while(pq.size() > 1){
            //pick two smallest ropes
            int first = pq.poll();
            int second = pq.poll();
            int cost = first + second;
            totalCost += cost;
            //add the combined rope back to the heap
            pq.add(cost);
        }
        return totalCost;

    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        System.out.println(Solution.minCost(ropes));
    }
}