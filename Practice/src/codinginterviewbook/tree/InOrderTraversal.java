package codinginterviewbook.tree;

import classes.BinaryTree;
import classes.TreeNode;

public class InOrderTraversal {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree(1);
		bt.root.left = new TreeNode(2);
		bt.root.right = new TreeNode(3);
		bt.root.left.left = new TreeNode(4);
		bt.root.left.right = new TreeNode(5);
		
		inOrderTraversal(bt.root);
	}
	/**
	 * InOrder Traversal ( Left, Root, Right )
	 * For above tree, O/P should be 4 2 5 1 3
	 * ALgo:
	  	1. Traverse the left subtree, i.e., call Inorder(left-subtree)
   		2. Visit the root.
   		3. Traverse the right subtree, i.e., call Inorder(right-subtree)
	 */
	private static void inOrderTraversal(TreeNode root) {
		if(null != root) {
			inOrderTraversal(root.left);
			System.out.print(root.val+" ");
			inOrderTraversal(root.right);
		}
	}

}
