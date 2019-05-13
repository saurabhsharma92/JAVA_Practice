package algorithm.searching;

public class JumpSearch {

	public static void main(String[] args) {
		int[] arr = new int[] {2,5,8,12,16,23,38,56,72,91};
		int key = 23;
		int index = jumpSearch(arr,key);
		System.out.println("found at index : "+index);
	}
 /**
  * Own implemntation...incorrect as Time complexity is of order
  * almost O(n^2)
  */
	/*private static int jumpSearch(int[] arr, int key) {
		int jump = (int) Math.sqrt(arr.length);
		int j = 0;
		while(j<arr.length) {
			if(arr[j] == key) {
				return j;
			}else if(arr[j] < key) {
				j += jump;
			}else if(arr[j] > key) {
				for(int i = j-j ; i < j; i++) {
					if(arr[i] == key) {
						return i;
					}
				}
				return -1;
			}
		}
		return -1;
	}*/
	
	/**
	 * Actual Implementation of order O(sqrt n)
	 */
	public static int jumpSearch(int[] arr, int x)     { 
		int n = arr.length;
		// Finding block size to be jumped
		int step = (int) Math.floor(Math.sqrt(n));
		// Finding the block where element is
		// present (if it is present)
		int prev = 0;
		while (arr[Math.min(step, n) - 1] < x) {
			prev = step;
			step += (int) Math.floor(Math.sqrt(n));
			if (prev >= n)
				return -1;
		}

		// Doing a linear search for x in block
		// beginning with prev.
		while (arr[prev] < x) {
			prev++;

			// If we reached next block or end of
			// array, element is not present.
			if (prev == Math.min(step, n))
				return -1;
		}

		// If element is found
		if (arr[prev] == x)
			return prev;

		return -1;
	}

}
