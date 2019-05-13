package algorithm.searching;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		int arr[] = {10, 20, 40, 45, 55};
        int x = 55;
        int index = exponentialSearch(arr,arr.length,x);
        System.out.println("found at index : "+index);
	}

	private static int exponentialSearch(int[] arr, int n, int key) {
		if(arr[0] == key)
			return 0;
		int i = 1;
		while(i < n && arr[i] <= key)
			i = i * 2;
		return Arrays.binarySearch(arr, i/2, Math.min(n,i), key);
	}
	
	/*static int exponentialSearch(int arr[], int n, int x) {
		// If x is present at first location itself 
		if (arr[0] == x)
			return 0;

		// Find range for binary search by 
		// repeated doubling 
		int i = 1;
		while (i < n && arr[i] <= x) {
			i = i * 2;
		}

		// Call binary search for the found range. 
		return Arrays.binarySearch(arr, i / 2, Math.min(i, n), x);
	}*/

}
