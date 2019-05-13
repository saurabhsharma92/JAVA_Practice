package interview;

public class Fibonacci {
/*		public static int fibonaci(int n) {
			if(n <= 0)
				return 0;
			//else if(n==1 || n == 2)
			else if(n==1)
				return 1;
			else
				return fibonaci(n-1)+fibonaci(n-2);
		}*/

		public static void main(String[] args) {
			int n = 10;
			for(int i=0;i<=n;i++){
				System.out.print(" " + fibonaci(i));
			}
		}

		private static int fibonaci(int i) {
			if(i<2)
				return i;
			else
				return fibonaci(i-1) + fibonaci(i-2);
		}
}
