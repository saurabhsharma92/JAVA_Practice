package interview;

import java.util.HashMap;
import java.util.Map;

public class FibonaciWithMemorization {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < n; i++) {
			System.out.println(" " + fibonacci(i));
		}
	}

	static Map<Integer,Integer> entries = new HashMap<Integer,Integer>();
	private static int fibonacci(int i) {
		int val = 0;
		if(entries.containsKey(i)) {
			System.out.print("-+");
			return entries.get(i);
		}
		if(i<2)
			val = i;
		else
			val =  fibonacci(i-1)+fibonacci(i-2);
		entries.put(i, val);
		return val;
	}
	
}
