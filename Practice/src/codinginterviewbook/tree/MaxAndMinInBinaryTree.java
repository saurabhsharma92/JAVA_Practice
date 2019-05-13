package codinginterviewbook.tree;

import classes.BinaryTree;
import classes.TreeNode;

public class MaxAndMinInBinaryTree {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree(1);
		bt.root.left = new TreeNode(2);
		bt.root.right = new TreeNode(3);
		bt.root.left.left = new TreeNode(4);
		bt.root.left.right = new TreeNode(5);
		System.out.println(findMin(bt.root));
		System.out.println(findMax(bt.root));
	}

	private static int findMax(TreeNode root) {
		if(null == root) return Integer.MIN_VALUE;
		int max = root.val;;
		int lMax = findMax(root.left);
		int rMax = findMax(root.right);
		if(lMax > max) {
			max = lMax;
		}
		if(rMax > max) {
			max = rMax;
		}
		return max;
	}
	
	private static int findMin(TreeNode root) {
		if(null == root) return Integer.MAX_VALUE;
		int min = root.val;
		int lMin = findMin(root.left);
		int rMin = findMin(root.right);
		if(lMin < min) {
			min = lMin;
		}
		if(rMin < min) {
			min = rMin;
		}
		return min;
	}

}
