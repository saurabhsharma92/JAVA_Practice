package codinginterviewbook.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class CheckPermutation {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bca";
		Set<String> sSet = new LinkedHashSet<String>();
		Set<String> perm = permutation("",s1,sSet);
		System.out.println(perm.toString());
		if(perm.contains(s2)) {
			System.out.println("Yes ! Permutation");
		}else {
			System.out.println("No ! Not a Permutation");
		}
		
	}
	private static Set<String> permutation(String prefix, String str, Set<String> sSet) {
		int n = str.length();
	    if (n == 0 && !("".equalsIgnoreCase(prefix))) {
	    	System.out.println("prefix : "+prefix);
	    	sSet.add(prefix);
	    }
	    else {
	        for (int i = 0; i < n; i++) {
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),sSet);
	        }
	    }
	    System.out.println("sSet : "+sSet);
		return sSet;
	}
}
