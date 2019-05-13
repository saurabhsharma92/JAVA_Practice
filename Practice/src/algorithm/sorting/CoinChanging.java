package algorithm.sorting;

/**
 * @author saura
 * Given a total and coins of certain denominations find number of ways total
 * can be formed from coins assuming infinity supply of coins
 *
 */
public class CoinChanging {

	public static void main(String[] args) {
		//int total = 15;
		//int[] coins = {3, 4, 6, 7, 9};
		
		int total = 5;
		int[] coins = {1, 2, 5};
		
		int res = countCoinChange(coins, total);
		System.out.println(res);
		
		int res1 = countCoinChange1D(coins, total);
		System.out.println(res1);
	}

	private static int countCoinChange(int[] coins, int total) {
		int[][] temp = new int[coins.length+1][total+1];
		for(int i=0; i<=coins.length; i++) {
			temp[i][0] = 1;
		}
		for(int i=1; i<= coins.length; i++) {
			for(int j=1; j<=total; j++) {
				if(coins[i-1] > j) {
					temp[i][j] = temp[i-1][j];
				}else {
					temp[i][j] = temp[i][j-coins[i-1]] + temp[i-1][j];
				}
			}
		}
		return temp[coins.length][total];
	}
	
	private static int countCoinChange1D(int[] coins, int total) {
		int[] T = new int[total + 1];
		T[0] = 1;
		for(int coin : coins) {
			for(int i=coin; i<=total; i++) {
				T[i] += T[i-coin];
			}
		}
		return T[total];
	}

}
