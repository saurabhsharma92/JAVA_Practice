package test;

import java.util.ArrayList;
import java.util.Collections;

public class Factors {
	public static void main(String[] args) {
		ArrayList<Integer> list = findFactors(8);
		System.out.println(list.toString());
	}
	
	public static ArrayList<Integer> findFactors(int num) {        
	    ArrayList<Integer> factors = new ArrayList<Integer>();

	    // Skip two if the number is odd
	    int incrementer = num % 2 == 0 ? 1 : 2;

	    for (int i = 2; i <= Math.sqrt(num); i += incrementer) {

	        // If there is no remainder, then the number is a factor.
	        if (num % i == 0) {
	            factors.add(i);

	            // Skip duplicates
	            if (i != num / i) {
	                factors.add(num / i);
	            }

	        }
	    }

	    // Sort the list of factors
	    Collections.sort(factors);

	    return factors;
	}
}
