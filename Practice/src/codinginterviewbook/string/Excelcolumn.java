package codinginterviewbook.string;

public class Excelcolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println((int)'A');
		//char c = (char) 65 + 4;
		//System.out.println(c);
		System.out.println(getExcelColumn(701));
		System.out.println(702/26);
	}
	
	private static String getExcelColumn(int n) {
		StringBuilder sb = new StringBuilder();
		int ch = n % 26;
		while(n>26) {
			int round = n / 26;			
			if(round > 0 && round <= 26) {
				sb.append(getChar(round));
			}else {
				sb.append(getChar(round - 26));
			}			
			n = n/26; 
		}
		if(ch != 0) {
			char c = (char) (64 + ch);
			sb.append(c);
		}else {
			char c = (char) (90 - ch);
			sb.append(c);
		}
		/*
		 * int round = n / 26; int ch = n % 26; StringBuilder sb = new StringBuilder();
		 * if(round > 0 && round <= 26 && ch != 0) { sb.append(getChar(round)); }else {
		 * sb.append(getChar()); } if(ch != 0) { char c = (char) (64 + ch);
		 * sb.append(c); }
		 */
		
		return sb.toString();
	}

	private static char getChar(int round) {
		char a = (char) (64 + round);
		return a;
	}
	
	

}
