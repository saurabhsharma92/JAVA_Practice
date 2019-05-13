package codinginterviewbook.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import classes.BinaryTree;
import classes.TreeNode;

public class BinaryTreeBFSMthd1 {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new TreeNode(1);
		bt.root.left = new TreeNode(2);
		bt.root.right = new TreeNode(3);
		bt.root.left.left = new TreeNode(4);
		insertKey(bt.root,5);
		insertKey(bt.root,6);
		insertKey(bt.root,7);
		insertKey(bt.root,8);
		System.out.println();
		System.out.println();
		System.out.println("height : "+height(bt.root));
		printLevelOrder(bt.root);
	}

	
	private static int height(TreeNode root) {
		if(root == null) return 0;
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		if(lHeight > rHeight) {
			return lHeight+1;
		}else {
			return rHeight+1;
		}
	}
	
	
	private static void printLevelOrder(TreeNode root) {
		for(int h=0; h<height(root) ;h++) {
			printGivenLevel(root,h);
		}
	}
	
	
	
	private static void printGivenLevel(TreeNode root, int h) {
		if(root == null) return;
		if(h == 1) {
			System.out.print(root.val + " ");
		}else {
			printGivenLevel(root.left, h-1);
			printGivenLevel(root.right, h-1);
		}
	}

	private static void insertKey(TreeNode root, int key) {
		if(root == null) return;
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		q1.add(root);
		while(!q1.isEmpty()) {
			root = q1.poll();
			if(null == root.left) {
				root.left = new TreeNode(key);
				break;
			}else if(null != root.left && null == root.right) {
				root.right = new TreeNode(key);
				break;
			}else {
				q1.add(root.left);
				q1.add(root.right);
			}
		}
	}
	
	//Simple method when u want all in the same line (BFS)
	private void printTree(TreeNode root) {
		if(root == null) return;
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		q1.add(root);
		while(!q1.isEmpty()) {
			root = q1.poll();
			System.out.print(root.val + " ");
			if(root.left != null) q1.add(root.left);
			if(root.right != null) q1.add(root.right);
		}
	}
}
