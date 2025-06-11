//package Day7.GreedyAlgos.PoliceAndThieves;
//
//import javax.imageio.stream.ImageInputStream;
//import java.util.ArrayDeque;
//import java.util.Deque;
//
//class Solution {
//    public int catchThieves(char[] arr, int k) {
//        Deque<Integer> police =  new ArrayDeque<>();
//        Deque<Integer> thief =  new ArrayDeque<>();
//        int result = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 'P'){
//                police.addLast(i);
//            }
//            else if(arr[i] == 'T'){
//                thief.addLast(i);
//            }
//        }
//        while(!police.isEmpty() && !thief.)
//
//
//    }
//
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        char[] arr = {'T','T','P','P','T','P'};
//        int k = 2;
//        System.out.println("Max thieves caught: " + s.catchThieves(arr,k));
//    }
//}