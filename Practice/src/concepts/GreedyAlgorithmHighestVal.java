package concepts;

import classes.CakeType;

public class GreedyAlgorithmHighestVal {

	public static void main(String[] args) {
		CakeType[] cakeTypes = new CakeType[] {
			    new CakeType(1, 60),
			    new CakeType(3, 90),
			    new CakeType(2, 15),
			    new CakeType(4, 160),
			};

			int capacity = 20;
			System.out.println(maxDuffelBagValue(cakeTypes, capacity));
	}

	private static int maxDuffelBagValue(CakeType[] cakeTypes, int capacity) {
		int val = 0;
		for(CakeType cake : cakeTypes) {
			if(cake.weight == 0) break;
			while(capacity - cake.weight >= 0) {
				val = val + cake.value;
				capacity = capacity - cake.weight;
			}
		}
		return val;
	}
 // can be done through dynamic programming
	// there are other concern : checkout the link and see bonus questions at the end
	//https://www.interviewcake.com/question/java/cake-thief?
}
