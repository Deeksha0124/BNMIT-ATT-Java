package Day7.GreedyAlgos.FractionalKnapsackProblem;

import java.util.Comparator;

class Solution {
    static class Item {
        int value, weight;

        Item(int v, int w) {
            value = v;
            weight = w;
        }
    }

    static class ItemComparator implements Comparator<Item> {
        @Override
        public int compare(Item a, Item b) {
            double r1 = (double) a.value / a.weight;
            double r2 = (double) b.value / b.weight;
            return Double.compare(r2, r1); //sort in desc order
        }
    }

    double fractionalKnapsack(int[] values, int[] weights, int w) {
        int n = values.length;
        Item[] items = new Item[n];
        //prepare the items
        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);

        }
        //sort the items value/weight ratio (per unit value)
        java.util.Arrays.sort(items, new ItemComparator());
        double totalValue = 0.0;
        for (int i = 0; i < n; i++) {
            if (items[i].weight <= w) {
                //take full time
                totalValue += items[i].value;
                w -= items[i].weight;
            } else {
                //take fractional part
                totalValue += ((double) items[i].value / items[i].weight) * w;
                break; //the knapsack is full
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int w = 50;
        double maxVal = solution.fractionalKnapsack(values, weights, w);
        System.out.println("Maximum knapsack value is: " + maxVal);
    }
}

