package Day6.TREES;

import java.util.Arrays;
import java.util.List;

class TrieNode{
    TrieNode[] children;
    boolean wordEnd;
    TrieNode(){
        wordEnd = false;
        children = new TrieNode[26]; //alphabets a to z to A to Z
    }
}
public class Trie {
    //insert and search -> Aryan -> {'a','r','y','a','n'};
    static void insertWord(TrieNode root, String word){
        TrieNode curr = root;
        for(char c : word.toCharArray()){
            c =  Character.toLowerCase(c);
            if(curr.children[c - 'a'] == null){
                //null means node is not present
                //so we create a node of that character
                curr.children[c - 'a'] = new TrieNode();
            }
            //move to the children node for the next character
            curr = curr.children[c - 'a'];
        }
        curr.wordEnd = true; // we have stored the word
    }
    static boolean searchWord(TrieNode root, String word){
        TrieNode curr = root;
        for(char c : word.toCharArray()){
            c =  Character.toLowerCase(c);  // Normalize to lowercase
            if(curr.children[c - 'a'] == null){
                return false; // node is not present in the trie, return false
            }
            curr = curr.children[c - 'a'];
        }
        return curr.wordEnd;
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        List<String> searchWords = Arrays.asList("Deeksha", "Pallavi", "Ravi", "Darshny");
        for(String word: searchWords){
            if(searchWord(root, word)){
                System.out.println(word + " is present in the Trie. ");
            }
            else{
                System.out.println(word + " is not present in the Trie. ");
            }

        }
    }
}
