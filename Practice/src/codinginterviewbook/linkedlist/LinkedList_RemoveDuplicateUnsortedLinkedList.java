package codinginterviewbook.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_RemoveDuplicateUnsortedLinkedList {

	public static void main(String[] args) {
		List l = new LinkedList<>();
		for(int i = 0 ; i < 10 ; i++) {
			l.add(i);
			l.add(i+1);
		}
		System.out.println("Intial List : "+l);
		List dupRem = new LinkedList_RemoveDuplicateUnsortedLinkedList().removeSuplicate(l);
		System.out.println("After Removing Duplicates : "+dupRem.toString());
	}
	
	List removeSuplicate(List l) {
		List dupRem = new LinkedList<>();
		for(Object d : l) {
			if(!dupRem.contains(d)) {
				dupRem.add(d);
			}
		}
		return dupRem;
	}

}
