package codinginterviewbook.tree;

import java.util.LinkedList;
import java.util.Queue;

import classes.BinaryTree;
import classes.TreeNode;

public class BinaryTreeInsertionLevelOrder {
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new TreeNode(1);
		bt.root.left = new TreeNode(2);
		bt.root.right = new TreeNode(3);
		bt.root.left.left = new TreeNode(4);
		System.out.println("Before Adding...");
		new BinaryTreeInsertionLevelOrder().printTree(bt.root);
		insertKey(bt.root,5);
		insertKey(bt.root,6);
		insertKey(bt.root,7);
		insertKey(bt.root,8);
		System.out.println("After Adding...");
		new BinaryTreeInsertionLevelOrder().printTree(bt.root);
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

	//Method 3 :  Using 1 queue and 2 counter
	/*private void printTree(TreeNode root) {
		if(root == null) return;
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		q1.add(root);
		int levelCount = 1;
		int currentCount = 0;
		while(!q1.isEmpty()) {
			root = q1.poll();
			System.out.print(root.val + " ");
			if(root.left != null) q1.add(root.left); currentCount++;
			if(root.right != null) q1.add(root.right); currentCount++;
			levelCount--;
			if(levelCount == 0) {
				levelCount = currentCount; 
				currentCount = 0;
				System.out.println();
			}
		}
	}*/
	
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
