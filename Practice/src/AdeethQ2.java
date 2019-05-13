import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdeethQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdeethQ2 q2 = new AdeethQ2();
		int rows = 3;
		int col = 3;
		
		List<Integer> l1 = new ArrayList<>();
		l1.addAll(Arrays.asList(1,0,0));
		List<Integer> l2 = new ArrayList<>();
		l1.addAll(Arrays.asList(1,0,0));
		List<Integer> l3 = new ArrayList<>();
		l1.addAll(Arrays.asList(1,9,0));
		
		List<List<Integer>> list = new ArrayList<>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
				
	}

	public int uniquePathsWithObstacles(List<List<Integer>> list) {
        //System.out.println("i : "+obstacleGrid.length);
        //System.out.println("j : "+obstacleGrid[0].length);
		/*
		 * if(obstacleGrid.length == 0 || obstacleGrid[0][0] == 1 ||
		 * obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1] == 1) return 0;
		 * else obstacleGrid[0][0]=1; for(int i=1; i<obstacleGrid.length; i++){
		 * if(obstacleGrid[i][0] == 1 || obstacleGrid[i-1][0]==0){ obstacleGrid[i][0] =
		 * 0; }else{ obstacleGrid[i][0] = 1; } }
		 * //System.out.println(Arrays.toString(T[0])); for(int i=1;
		 * i<obstacleGrid[0].length; i++){ if(obstacleGrid[0][i] == 1 ||
		 * obstacleGrid[0][i-1]==0){ obstacleGrid[0][i] = 0; }else{ obstacleGrid[0][i] =
		 * 1; } } for(int i=1; i<obstacleGrid.length; i++){ for(int j=1;
		 * j<obstacleGrid[0].length; j++){ if(obstacleGrid[i][j] == 1){
		 * obstacleGrid[i][j] = 0; }else{ obstacleGrid[i][j] = obstacleGrid[i-1][j] +
		 * obstacleGrid[i][j-1]; } } } //System.out.println(Arrays.toString(T[0]));
		 * return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
		 */
    }
}
