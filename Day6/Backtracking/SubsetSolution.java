package Day6.Backtracking;

import java.util.ArrayList;
import java.util.List;

class SubsetSolution {
    private static void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans){
        //base case
        if(index >= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        //exclude case
        solve(nums, output, index + 1, ans); //skip that curr value
        //include case
        output.add(nums[index]); //store that value and move to next index
        solve(nums, output, index + 1, ans);
        output.remove(output.size() - 1); // backtracking
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }

    public static void main(String[] args) {
        SubsetSolution solution = new SubsetSolution();
        int[] nums = {1 ,2 ,3};
        List<List<Integer>> result = SubsetSolution.subsets(nums);
        for(List<Integer> subsets:result){
            System.out.println(subsets);
        }
    }

}
