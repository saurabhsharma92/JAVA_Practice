package test;

public class WordCount {

	public static void main(String[] args) {
		String testString = "I am current international student in University at Buffalo, State University at New York  and I am pursuing to become a data scientist or get a job in field in data analyst.\r\n" + 
				"I have opted for Masters in Management Information Systems as it will give me knowledge about data science and data analyst field.\r\n" + 
				"I am hoping to get job in one of these two fields after completing my graduation in a year.\r\n" + 
				"Although Excel is old and new tools have emerged in the market but the extent of functionality provided by excel is amazing. Learning this course will help me gain some confidence in Interview.\r\n" + 
				"Instead of many emerging tools such as R and IBM Watson and TABLEAU. Excel still remain core and good hands on knowledge gives an edge in interview.\r\n" + 
				"Hence this course will provide me expertise in Excel.\r\n" + 
				"";
		
		String [] strArr = testString.split(" ");
		System.out.println("length : "+strArr.length);
	}

}
