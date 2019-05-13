package interview;

import java.util.HashMap;
import java.util.Map;

public class FibonaciSum {

	public static void main(String[] args) {
		int n = 0;
		System.out.println(new FibonaciSum().fib(n));
	}

	public int fib(int N) {
		int i = 0;
		if(N==0) {
			return 0;
		}else if(N==1) {
			return 1;
		}
		while(i < N) {
			fibonacci(i);
			i++;
		}
		return map.get(N-2)+ map.get(N-1);
	}
	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
	public int fibonacci(int N) {
		int val = 0;		
		if (N < 2) {
			val = N;
		}  else {
			val = fibonacci(N - 2) + fibonacci(N - 1);
		}
		map.put(N, val);
		return val;
	}

}
