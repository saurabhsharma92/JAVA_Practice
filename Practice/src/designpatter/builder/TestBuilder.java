package designpatter.builder;

public class TestBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer comp = new Computer.ComputerBuilder("24","12").setLaptop(true).build();
		System.out.println(comp.toString());
	}

}
	