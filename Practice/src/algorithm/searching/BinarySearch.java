package algorithm.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] {1,3,5,6};
		int key = 5;
		int start = 0;
		int end = arr.length - 1;
		int index = binarySearch(arr,start,end,key);
		System.out.println("found at index : "+index);
	}

	private static int binarySearch(int[] arr, int start, int end, int key) {
		int mid = (start + end)/2;
		if(end >= start) {
			if(key == arr[mid]) {
				return mid;
			}else if(arr[mid] > key) {
				return binarySearch(arr, start, mid-1, key);
			}else if(arr[mid] < key) {
				return binarySearch(arr, mid + 1, end, key);
			}
		}
		return -1;
	}

}
