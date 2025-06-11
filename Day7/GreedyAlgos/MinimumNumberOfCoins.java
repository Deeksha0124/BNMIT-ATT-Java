package Day7.GreedyAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNumberOfCoins {
    static void findMinimumNumberOfCoins(List<Integer> coins, int V){
        List<Integer> result = new ArrayList<>();
        //if the array or list is not sorted, sort it first
        //traverse the sorted array from the end to the beginning
        for(int i = coins.size() - 1; i>=0; i--){
            while(V >= coins.get(i)){
                V -= coins.get(i);
                result.add(coins.get(i));
            }
        }
        System.out.print("Coins selected: ->");
        for(int coin: result){
            System.out.print(coin + " ");
        }
        System.out.println();
        System.out.println("Minimum number of coins: -> " + result.size());
    }

    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000);
        int V1 = 377;
        findMinimumNumberOfCoins(coins, V1);

    }

}
