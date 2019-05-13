package algorithm.sorting;

public class KnapSack0_1 {

	public static void main(String[] args) {
		int [] values = new int[] {20, 22, 15, 30, 24, 54, 21, 32, 18, 25};
		int [] weight = new int[] {4, 2, 3, 5, 5, 6, 9, 7, 8, 10};
		int totalW = 30;
		
		//i -> row -> given weights
		//j -> column -> 0 to total weights
		
		int val = bottopUpDP(values, weight, totalW);
		System.out.println(val);
	}

	private static int bottopUpDP(int[] values, int[] weight, int totalW) {
		int k[][] = new int[values.length + 1][totalW + 1];
		for(int i=0; i<values.length; i++) {
			for(int j=0; j<=totalW; j++) {
				if(i == 0 || j == 0) {
					k[i][j] = 0;
					continue;
				}
				if(j - weight[i-1] >= 0) {
					k[i][j] = Math.max(k[i-1][j], k[i-1][j-weight[i-1]] + values[i-1]);
				}else {
					k[i][j] = k[i-1][j];
				}
			}
		}
		return k[values.length][totalW];
	}

}
