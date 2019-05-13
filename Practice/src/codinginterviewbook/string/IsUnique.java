package codinginterviewbook.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class IsUnique {

	public static void main(String[] args) {
		String s  = new String("abc");
		char [] chrs = s.toCharArray();
		Set stringSet = new LinkedHashSet();
		for(char c : chrs) {
			stringSet.add(c);
		}
		System.out.println(s.length() +" "+ stringSet.size());
		if(s.length() == stringSet.size()) {
			System.out.println("Unique");
		}else {
			System.out.println("Not Unique");
		}
	}

}
