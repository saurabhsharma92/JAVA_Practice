package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =  7;
		int d = 2;
		int a[] = {1, 2, 3, 4, 5, 6, 7};
		
		/*List temp = new ArrayList();
		
		for(int i = 0; i <d; i++) {
			temp.add(a[i]);
		}
		System.out.println(temp);
		
		int tempArr [] = new int[d];
		for(int i=0 ; i < d ; i++) {
			tempArr[i] = a[i];
		}
		*/
		/*for(int j = 0; j<d; j++) {
			int temp = a[0];
			for(int i=1 ; i<n ; i++) {
				a[i-1] = a[i];
			}
			a[a.length-1] = temp;
		}
		*/
		
		
		int [] a1 = Arrays.copyOfRange(a, 0, 1);
		int [] a2 = Arrays.copyOfRange(a, 2, a.length);
		rotateArray(a,d,n);
		printArray(a);
		Map<Integer,Integer> map = new HashMap<>();
		map.put(1,2);
		map.put(2,3);
		Collection<Integer> av = map.values();
		System.out.println("map values : "+Arrays.asList(av));
	}
	
	public static void rotateArray(int a[], int d, int n) {
		reverseArray(a,0,d-1);
		reverseArray(a,d,n-1);
		reverseArray(a,0,n-1);
	}
	
	public static void reverseArray(int a[], int start, int end) {
		int temp;
		while( start < end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;			
		}
	}
	
	public static void printArray(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
	