package codinginterviewbook.tree;

import classes.BinaryTree;
import classes.TreeNode;

public class PreOrderTraversal {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree(1);
		bt.root.left = new TreeNode(2);
		bt.root.right = new TreeNode(3);
		bt.root.left.left = new TreeNode(4);
		bt.root.left.right = new TreeNode(5);
		
		preOrderTraversal(bt.root);
	}
	/**
	 * InOrder Traversal ( Root, Left, Right )
	 * For above tree, O/P should be 1 2 4 5 3 
	 * ALgo:
	  	1. Visit the root.
   		2. Traverse the left subtree, i.e., call Preorder(left-subtree)
   		3. Traverse the right subtree, i.e., call Preorder(right-subtree)
	 */
	private static void preOrderTraversal(TreeNode root) {
		if(null != root) {
			System.out.print(root.val+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

}
