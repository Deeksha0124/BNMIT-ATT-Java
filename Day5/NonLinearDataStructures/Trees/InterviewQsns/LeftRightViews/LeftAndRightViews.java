package Day5.NonLinearDataStructures.Trees.InterviewQsns.LeftRightViews;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node right;
    Node left;
    Node(int x){
        val = x;
        left = right = null;
    }
}


public class LeftAndRightViews {
    public static void leftView(Node root){
        if(root == null){
            System.out.println("Empty Tree");
            return;
        }
        Node temp = root;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.left;
        }
        System.out.println();
    }

    public static void rightView(Node root){
        if(root == null){
            System.out.println("Empty Tree");
            return;
        }
        Node temp = root;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.right;
        }
        System.out.println();
    }

    public static void printLeftView(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node node = q.poll();
                if (node == null) continue; // null check

                if (i == 0) {
                    System.out.print(node.val + " "); // first node in this level
                }

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
        }
        System.out.println();
    }



    public static void printRightView(Node root){
        if(root == null){
            return;
    }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            for(int i = 0; i< levelSize; i++){
                Node node = q.poll();
                if(i == levelSize-1) {
                    System.out.print(node.val + " ");
                }// last node at that level
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
        System.out.println();
    }



public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        //root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        //root.right.right = new Node(7);
        leftView(root);
        rightView(root);
        printLeftView(root);
        printRightView(root);

}
}

