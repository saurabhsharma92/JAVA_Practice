package interview;

public class Factorial {

	static int factorial(int n) {
		if(n == 0)
			return 1;
		else
			return(n*factorial(n-1));
	}
	public static void main(String[] args) {
		//System.out.println(factorial(10));
		int x = 1;
		int rem = (int) (x /10);
		System.out.println(rem);
	}

}
