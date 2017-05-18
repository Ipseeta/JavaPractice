package search.BinarySearchTree;

/**
 * Created by ipseeta on 5/18/17.
 */
public class BinaryTree {
    private Node root;
    private boolean isBST(){
        return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean isBSTUtil(Node root, int minValue, int maxValue) {
        return root==null || !((root.data < minValue) || (root.data > maxValue)) && isBSTUtil(root.left,minValue,root.data-1) && isBSTUtil(root.right,root.data+1,maxValue);
    }


    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        if (tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

}
