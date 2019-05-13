package concepts;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PPALALL";
		//(".*LLL.*|.*A.*A.*")
		if(s.matches(".*[A].*[A].*")) {
			System.out.println("yay");
		}else {
			System.out.println("nay");
		}
	}

}
