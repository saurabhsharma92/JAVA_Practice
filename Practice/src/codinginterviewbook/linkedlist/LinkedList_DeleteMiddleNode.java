package codinginterviewbook.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_DeleteMiddleNode {

	public static void main(String[] args) {
		List l = new LinkedList<>();
		int obj = 10;
		for(int i = 0 ; i < 10 ; i++) {
			l.add(i);
			l.add(i+1);
		}
		System.out.println("Intial List : "+l);
		LinkedList_DeleteMiddleNode.delteMiddleNode(l,obj);
		System.out.println("After Processing List : "+l);
	}

	private static void delteMiddleNode(List l, int i) {
		int index = l.indexOf(i);
		System.out.println("index: "+index+" size : "+l.size());
		if(index != 0 && index != l.size()-1) {
			l.remove(index);
		}else {
			System.out.println("Not a middle node");
		}
	}

}
