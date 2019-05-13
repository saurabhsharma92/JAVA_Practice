package algorithm.sorting;

import java.util.HashMap;
import java.util.Map;

public class MiniumCoinChange {

	public static void main(String[] args) {
		int total = 3;
		int[] coins = {2};
		
		int res = bottomUpDP(coins, total);
		System.out.println("bottom Up -> "+res);
		
		Map<Integer, Integer> map = new HashMap<>();
		int res1 = topDownRecursiveDP(coins, total, map);
		System.out.println("top down ->"+res1);

	}

	private static int bottomUpDP(int[] coins, int total) {
		int[] T = new int[total + 1];
		int[] R = new int[total + 1];
		T[0] = 0;
		for(int i=1; i<=total; i++) {
			T[i] = Integer.MAX_VALUE - 1;
			R[i] = -1;
		}
		
		for(int i=0; i<coins.length; i++) {
			for(int j=1; j<=total; j++){
				if(j >= coins[i]) {
					if(T[j - coins[i]] + 1 < T[j]) {
						T[j] = 1 + T[j - coins[i]];
						R[j] = i;
					}
				}
			}
		}
		return T[total];
	}
	
	private static int topDownRecursiveDP(int[] coins, int total, Map<Integer, Integer> map) {
		if(total == 0) return 0;
		if(map.containsKey(total)) return map.get(total);
		int min = Integer.MAX_VALUE;
		for(int i=0; i<coins.length; i++) {
			if(coins[i] > total) continue;
			int val = topDownRecursiveDP(coins, total - coins[i], map);
			min = Math.min(val, min);
		}
		min = (min == Integer.MAX_VALUE) ? min : min+1;
		map.put(total, min);
		return min;
	}

}
