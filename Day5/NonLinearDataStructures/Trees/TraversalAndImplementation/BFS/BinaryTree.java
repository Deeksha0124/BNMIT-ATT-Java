package Day5.NonLinearDataStructures.Trees.TraversalAndImplementation.BFS;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class BinaryTree{
    public static void LevelOrderTraversal(TreeNode root){
        //base case
        //if the root is empty - don't traverse
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");

            //left subtree
            if(temp.left != null){
                queue.add(temp.left);
            }
            //right subtree
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println("Level order traversal of Binary Tree: " );
        LevelOrderTraversal(root);
    }


}
