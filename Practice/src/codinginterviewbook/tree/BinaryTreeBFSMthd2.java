package codinginterviewbook.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import classes.BinaryTree;
import classes.TreeNode;

public class BinaryTreeBFSMthd2 {
	
	//private TreeNode root;

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new TreeNode(1);
		bt.root.left = new TreeNode(2);
		bt.root.right = new TreeNode(3);
		bt.root.left.left = new TreeNode(4);
		
		new BinaryTreeBFSMthd2().printTree(bt.root);
		System.out.println(levelOrder(bt.root).toString());
	}

	//Method 1 : using two queue method
	/*private void printTree(TreeNode root) {
		if(root == null) return;
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		Queue<TreeNode> q2 = new LinkedList<TreeNode>();
		q1.add(root);
		while(!(q1.isEmpty()) || !(q2.isEmpty())) {
			while(!q1.isEmpty()) {
				root = q1.poll();
				System.out.print(root.val + " ");
				if(root.left != null) q2.add(root.left);
				if(root.right != null) q2.add(root.right);
			}
			System.out.println();
			while(!q2.isEmpty()) {
				root = q2.poll();
				System.out.print(root.val + " ");
				if(root.left != null) q1.add(root.left);
				if(root.right != null) q1.add(root.right);
			}
			System.out.println();
		}

	}*/
	
	//Method 2 :  using 1 queue and 1 delimiter = null
	/*private void printTree(TreeNode root) {
		if(root == null) return;
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		q1.add(root);
		q1.add(null);
		while(q1.size() > 1 || q1.peek() != null) {
			//while(!q1.isEmpty()) {
				root = q1.poll();
				if(root != null) {
					System.out.print(root.val + " ");
					if(root.left != null) {
						q1.add(root.left);
					}
					if(root.right != null) {
						q1.add(root.right);
					}
				}else {
					q1.add(null);
					System.out.println();
				}
			//}
		}

	}*/
	
	//Method 3 :  Using 1 queue and 2 counter
	private void printTree(TreeNode root) {
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
	}
	
	//Best solution as it takes least time and memory
	public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        traverse(result, root, 0);
        return result;
    }
    
    public static void traverse(List<List<Integer>> result, TreeNode root, int level) {
        if(root == null)
            return;
        
        if(result.size() <= level)
            result.add(new ArrayList<Integer>());
        
        result.get(level).add(root.val);
        traverse(result, root.left, level + 1);
        traverse(result, root.right, level + 1);
    }
}
