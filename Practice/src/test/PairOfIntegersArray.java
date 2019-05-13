package test;

import java.util.HashMap;
import java.util.Map;

public class PairOfIntegersArray {

	public static void main(String[] args) {
		int[] arr = {1,7,5,9,2,12,3};
		int diff = 2;
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr.length ; j++) {
				if(arr[i] - arr[j] == -2) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
		
		System.out.println("Using Hash Map............");
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i< arr.length; i++)
			map.put(arr[i], arr[i]);
		
		for(Map.Entry<Integer, Integer> e : map.entrySet())
			if(map.containsKey(e.getKey() + diff)) {
				System.out.println("("+e.getKey()+","+(e.getKey()+2)+")");
			}
	}

}
