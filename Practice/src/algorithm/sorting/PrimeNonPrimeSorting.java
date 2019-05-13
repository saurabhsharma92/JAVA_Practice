package algorithm.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrimeNonPrimeSorting {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("abc aqwrwer");
		list.add("def 23424");
		list.add("cdr bdfdsf");
		list.add("rth 6756");
		list.add("ert adfs");
		list.add("abc 86634");
		list.add("mkh cdhjgtt");
		list.add("uyh 12331");
		list.add("olp bdfs");
		list.add("qwe 987868");
		
		List<String> prime = new ArrayList<>();
		List<String> nonprime = new ArrayList<>();
		
		for(String str : list) {
			if(str.split(" ")[1].matches("[0-9]+")) {
				nonprime.add(str);
			}else {
				prime.add(str);
			}
		}
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				//return s1.split(" ")[1].length() - s2.split(" ")[1].length();
				if(s1.split(" ")[1].matches("[0-9]+") && s2.split(" ")[1].matches("[0-9]+")) {
					return 0;
				}else if(s1.split(" ")[1].matches("[0-9]+") && !s2.split(" ")[1].matches("[0-9]+")) {
					return 1; 
				}else if(!s1.split(" ")[1].matches("[0-9]+") && s2.split(" ")[1].matches("[0-9]+")) {
					return -1; 
				}else {
					return s1.split(" ")[1].compareTo(s2.split(" ")[1]);
				}
			}
			
		});
		
		prime.addAll(prime.size(), nonprime);
		System.out.println(list.toString());
	}

}
