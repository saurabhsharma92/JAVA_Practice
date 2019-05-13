package concepts;

import java.util.ArrayList;

public class ArrayListClone {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		// Adding elements to the ArrayList
		al.add("Apple");
		al.add("Orange");
		al.add("Mango");
		al.add("Grapes");
		System.out.println("ArrayList: " + al);

		ArrayList<String> al3 = (ArrayList<String>) al.clone();
		ArrayList<String> al2 = al;

		// add and remove on original ArrayList
		al.add("Fig");
		al.remove("Orange");

		// Display of both ArrayLists after add & remove
		System.out.println("Original ArrayList:" + al);
		System.out.println("Shallow Cloned ArrayList:" + al2);
		System.out.println("Deep copy of ArrayList: " + al3);
		
		StringBuilder sb = new StringBuilder("12");
		int a = 9;
		sb.insert(0,a);
		System.out.println(sb.toString());
	}

}
