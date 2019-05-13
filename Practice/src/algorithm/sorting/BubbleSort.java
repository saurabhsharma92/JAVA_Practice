package algorithm.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[] {4,2,7,1,9};
		int[] ar1 = new int[] {4,2,7,1,9};
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		bubbleSortRecursively(ar1,ar1.length);
		System.out.println("Recursively : "+Arrays.toString(ar1));
	}
	
	public static void bubbleSortRecursively(int[] arr, int n) {
		if(n==1) return;
		for(int j=0; j<n-1; j++) {
			if(arr[j] > arr[j+1]) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
		bubbleSortRecursively(arr,n-1);
	}
}
