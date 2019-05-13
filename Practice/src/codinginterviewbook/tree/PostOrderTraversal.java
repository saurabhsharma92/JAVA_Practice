package codinginterviewbook.tree;

import classes.BinaryTree;
import classes.TreeNode;

public class PostOrderTraversal {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree(3);
		bt.root.left = new TreeNode(9);
		bt.root.right = new TreeNode(20);
		bt.root.right.left = new TreeNode(15);
		bt.root.right.right = new TreeNode(7);
		
		postOrderTraversal(bt.root);
	}
	/**
	 * InOrder Traversal ( Left, Right, Root )
	 * For above tree, O/P should be 4 5 2 3 1 
	 * ALgo:
	  	1. Traverse the left subtree, i.e., call Postorder(left-subtree)
   		2. Traverse the right subtree, i.e., call Postorder(right-subtree)
   		3. Visit the root.
	 */
	private static void postOrderTraversal(TreeNode root) {
		if(null != root) {			
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.val+" ");
		}
	}

}
