package interview;

public class BiggestNum {

	public static void main(String[] args) {
		int a[] = {1,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45
				,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45,2,4,5,23,45,12,87,99,56,79,45};
		int highestNumIter, highestNumRecur = 0;
		long startTimeIter = System.currentTimeMillis();
		highestNumIter = iterativeMthd(a);
		long endTimeIter = System.currentTimeMillis();
		long startTimeRecur = System.currentTimeMillis();
		highestNumRecur = recursiveMthd(a,a.length,highestNumRecur);
		long endTimeRecur = System.currentTimeMillis();
		System.out.println("highestNumIter : "+highestNumIter+" highestNumRecur : "+highestNumRecur);
		System.out.println(" Time take by Iteration = "+(startTimeIter - endTimeIter));
		System.out.println(" Time take by Recursion = "+(startTimeRecur - endTimeRecur));
	}

	private static int iterativeMthd(int[] a) {
		int tempHighest = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > tempHighest)
				tempHighest = a[i];
		}
		return tempHighest;
	}

	private static int recursiveMthd(int[] a, int n, int highestNumRecur) {
		if(n == -1)
			return highestNumRecur;
		else
			if(n != 0 && a[n-1] > highestNumRecur)
				highestNumRecur = a[n-1];
			else if(n == 0 && a[0] > highestNumRecur)
				highestNumRecur = a[0];
		
		return recursiveMthd(a,n-1,highestNumRecur);
	}

}