package Day5.NonLinearDataStructures.Trees.InterviewQsns.MirrorOfBT;

class Tree {
    Tree root;
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data = data;
        this.left = this.right = null;
    }

    private static void inorder(Tree root){ //LDR
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    private static Tree mirrorTree(Tree root){
        if(root == null){
            return root;
        }
        //swap the left and right subtrees
        Tree temp = root.left;
        root.left = root.right;
        root.right = temp;

        //recursively swap the left and right subtrees
        if(root.left != null){
            mirrorTree(root.left);
        }
        if(root.right != null){
            mirrorTree(root.right);
        }
        return root;
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);

        System.out.println("Inorder traversal of original tree is : ");
        inorder(root);

        System.out.println();

        root = mirrorTree(root);
        System.out.println("Inorder traversal of mirror tree is : ");
        inorder(root);
        System.out.println();

    }
}


