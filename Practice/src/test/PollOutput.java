package test;

public class PollOutput {

	/**
	 * 1 -> Hillary
	 * 2 -> Trump
	 * 3 -> Unsure
	 * @param args
	 */
	public static void main(String[] args) {
		int trump = 0,hillary = 0,undecided = 0;
		int [] result = {1,2,3,3,2,1,2,3,1,1,2,3,2,1,2,3,3,2,1,1,2,3,2,1,1,3,2,3,2,1,2,3,1,1,2,3,2,1,2,3,3,2,1};
		for(int i : result){
			if(i == 1) {
				hillary++;
			}else if(i == 2) {
				trump++;
			}else {
				undecided++;
			}
		}
		System.out.println("hillary : "+hillary+" trump : "+trump+" undecided : "+undecided);
		percentageCal(result.length,hillary,trump,undecided);
	}

	private static void percentageCal(int length, int hillary, int trump, int undecided) {
		System.out.println("length : "+length);
		float hillaryPer = (hillary * 100) / length;
		float trumpPer = (trump * 100 ) / length;
		float undecidedPer = (undecided * 100) / length;
		
		System.out.println("Chance of Hillary Winning : "+hillaryPer+ "%");
		System.out.println("Chance of Trump Winning : "+trumpPer+"%");
		System.out.println("Undecided : "+undecidedPer+"%");
	}

}
