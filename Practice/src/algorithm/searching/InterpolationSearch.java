package algorithm.searching;

public class InterpolationSearch {
	
	static int arr[] = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47}; 
	
	public static void main(String[] args) {
		int key = 47;
		int index = interpolationSearch(key);
		System.out.println("Found at index : "+index);
	}

	private static int interpolationSearch(int key) {
		int lo = 0;
		int hi = arr.length - 1;
		while( lo < hi && key >= arr[lo] && key <= arr[hi]) {
			int pos = lo + ((key - arr[lo]) * (hi-lo))/(arr[hi] - arr[lo]);
			if(arr[pos] == key)
				return pos;
			if(arr[pos] < key) {
				lo = pos + 1;
			}else {
				hi = pos - 1; 
			}
		}
		return -1;
	}

}
