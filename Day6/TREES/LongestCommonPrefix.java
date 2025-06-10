package Day6.TREES;

import java.util.Arrays;

class TrieNode1{
    TrieNode1[] children =  new TrieNode1[26];
    boolean isEndOfWord = false;
    int childrenCount;
    TrieNode1(){
        isEndOfWord = false;
        childrenCount = 0;
        Arrays.fill(children,null);
    }
}

public class LongestCommonPrefix {
    public static void insert(TrieNode1 root, String key){
        TrieNode1 current = root;
        for(char c: key.toCharArray()){
            int index = c - 'a';
            if(current.children[index] == null){
                current.children[index] = new TrieNode1();
                current.childrenCount++;
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }
    public static String longestCommonPrefix(TrieNode1 root){
        //c + o + d + e -> StringBuilder
        StringBuilder prefix = new StringBuilder();
        TrieNode1 current = root;
        while(current != null && current.childrenCount == 1 && !current.isEndOfWord){
            for(int i=0; i<26; i++){
                if(current.children[i] != null){
                    prefix.append((char) (i + 'a'));
                    current = current.children[i]; // move to the next character
                    break;

                }
            }
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        TrieNode1 root = new TrieNode1();
        String[] words = {"flower", "flow", "flight", "fly", "flown"};
        for(String word: words){
            insert(root, word);
        }
        String lcp = longestCommonPrefix(root); // fl
        if(lcp.isEmpty()){
            System.out.println("There is no common prefix among the input words.");
        }
        else{
            System.out.println("The longest common prefix is: " + lcp);
        }
    }

}
