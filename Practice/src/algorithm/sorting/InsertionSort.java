package algorithm.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] {4,2,7,1,9};
		int[] ar1 = new int[] {4,2,7,1,9};
		for(int i=0; i<arr.length; i++) {
			int j = i-1;
			int key = arr[i];
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println(Arrays.toString(arr));
		insertionSortRecursively(ar1, ar1.length);
		System.out.println(Arrays.toString(ar1));
	}
	
	public static void insertionSortRecursively(int[] arr, int n) {
		if(n==1) return;
		insertionSortRecursively(arr, n-1);
		int j = n-2;
		int last = arr[n-1];
		while(j >= 0 && arr[j] > last) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = last;
	} 

}
