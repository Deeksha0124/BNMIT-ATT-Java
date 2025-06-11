package Day6.Backtracking.LetterCombinationsOfPhNo;

import java.util.ArrayList;
import java.util.List;

class Solution {


    private void solve(String digits, String output, int index, List<String> ans, String[] mapping){
        //Base case
        if(index >= digits.length()){
            ans.add(output);
            return;
        }
        int number = digits.charAt(index) - '0'; // eg: a - ascii value , if we get 2 here
        String value = mapping[number];// for 2 corresponding string value will be 'abc'
        for(int i = 0; i < value.length(); i++){
            output += value.charAt(i); //chosen 'a'
            solve(digits, output, index+1, ans, mapping);
            output = output.substring(0, output.length()-1); //removing 'a', Backtracking
        }
    }



    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        // Base case
        if(digits == null || digits.length() == 0){
            return result;
        }

        String[] mapping={
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv" , "wxyz"
        };
        solve(digits, "", 0, result, mapping);
        return result;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result = solution.letterCombinations("23");
        System.out.println(result);
    }
}