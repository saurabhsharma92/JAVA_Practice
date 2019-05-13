package concepts;

public abstract class AbstractClass {
	
	public int valA;
	
	//public AbstractClass() {
		//System.out.println("Inside AbstractClass custom default constructor");
	//}
	
	//public AbstractClass(int a) {
		//this.valA = a;
		//System.out.println("Inside AbstractClass parameterized constructor "+this.valA);
	//}

	public String print() {
		return "Hello World";
	}
	
	public abstract String check();

}
