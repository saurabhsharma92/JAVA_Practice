package concepts;

public class TestClass extends AbstractClass{
	
	public int val;
	
	//public TestClass() {
		//super(0);
		//System.out.println("Inside TestClass custom default constructor");
	//}
	
	public TestClass(int a) {
		//super();
		//super(a);
		this.val = a;
		System.out.println("Inside TestClass constructor "+this.val);
	}

	public static void main(String[] args) {
		AbstractClass t1 = new TestClass(10);
		System.out.println(t1.print());
		
	}

	@Override
	public String check() {
		// TODO Auto-generated method stub
		return "";
	}

}
