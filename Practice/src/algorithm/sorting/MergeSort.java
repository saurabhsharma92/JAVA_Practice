package algorithm.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {12,11,13,5,6,7};
		mergeSort(arr, 0 , arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		//Find the size of two array
		int n1 = mid - start + 1;
		int n2 = end - mid;
		
		// create temp array
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		//copy data to temp array
		for(int i=0; i<n1; ++i) {
			left[i] = arr[start + i];
		}
		for(int i=0; i<n2; ++i) {
			right[i] = arr[mid + 1 + i];
		}
		
		//Merge temp array
		//Intial index of first and second subarray
		int i = 0, j = 0;
		//Initial index of merged subarray
		int k = start;
		while(i < n1 && j < n2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			}else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

}
