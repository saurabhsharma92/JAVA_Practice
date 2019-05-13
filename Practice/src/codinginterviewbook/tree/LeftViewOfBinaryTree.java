package codinginterviewbook.tree;

import classes.BinaryTree;
import classes.TreeNode;

public class LeftViewOfBinaryTree {
	
	static int maxLevel = 0;

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree(4);
		bt.root.left = new TreeNode(5);
		bt.root.right = new TreeNode(2);
		bt.root.right.left = new TreeNode(3);
		bt.root.right.right = new TreeNode(1);
		bt.root.right.left.left = new TreeNode(6);
		bt.root.right.left.right = new TreeNode(7);
		
		leftViewOfBinaryTree(bt.root,0);
	}

	private static void leftViewOfBinaryTree(TreeNode root, int currentLevel) {
		if(null != root) {
			currentLevel++;
			if(currentLevel > maxLevel) {
				System.out.print(root.val+ " ");
				maxLevel = currentLevel;
			}
			leftViewOfBinaryTree(root.left,currentLevel);
			leftViewOfBinaryTree(root.right,currentLevel);
		}
	}

}
