package codinginterviewbook.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_SumList {

	public static void main(String[] args) {
		List l1 = new LinkedList<>();
		l1.add(7);
		l1.add(1);
		l1.add(6);
		List l2 = new LinkedList<>();
		l2.add(5);
		l2.add(9);
		l2.add(2);
		
		addList(l1,l2,"F");
	}

	private static void addList(List l1, List l2, String option) {
		double sum = 0;
		if("R".equalsIgnoreCase(option)) {
			for(int i = 0; i<l1.size(); i++) {
				sum = sum + ((int)l1.get(i) * 1 * Math.pow(10, i)) +  ((int)l2.get(i) * 1 * Math.pow(10, i));
			}
		} else if("F".equalsIgnoreCase(option)) {
			for(int i = l1.size()-1; i >= 0 ; i--) {
				sum = sum + ((int)l1.get(i) * 1 * Math.pow(10, i)) +  ((int)l2.get(i) * 1 * Math.pow(10, i));
			}
		}
		System.out.println(sum);
	}

}
