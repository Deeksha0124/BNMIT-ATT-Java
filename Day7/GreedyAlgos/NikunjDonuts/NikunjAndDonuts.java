package Day7.GreedyAlgos.NikunjDonuts;

import java.util.Arrays;
import java.util.Scanner;

public class NikunjAndDonuts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input the number of donuts
        int n = sc.nextInt();
        int[] calories = new int[n];
        //input the calories values
        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }
        //sort the array in descending order to eat highest-calories donuts  first
        Arrays.sort(calories);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int temp = calories[left];
            calories[left] = calories[right];
            calories[right] = temp;
            left++;
            right--;
        }

//        int totalMiles = 0;
//        for(int i = 0; i < n; i++){
//            totalMiles += Math.pow(2,i) * calories[i];
            long totalMiles = 0 ;
            for(int i = 0; i < n; i++){
        totalMiles += (1L << i) * calories[i];

    }
        System.out.println(totalMiles + " miles ");

}
}
