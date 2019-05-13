package test;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int arra[] = {1,2,3,4,5};
		
		System.out.println("before rotation : ");
		System.out.println(Arrays.toString(arr));
		
		int arr1[] = rotate(arr);
		int arr2[] = rotate1(arra);
		
		System.out.println("after rotation : ");
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("after rotation1 : ");
		System.out.println(Arrays.toString(arr2));
	}
	
	// Right rotation
	static int[] rotate(int [] arr) {
		int temp = arr[arr.length -1];
		for(int i = arr.length -1 ; i> 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		
		return arr;
	}	
	
	//Left Rotation
	static int[] rotate1(int [] arr) {
		int temp = arr[0];
		for(int i = 1 ; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length - 1] = temp;
		return arr;
	}
}
