package oops_Concepts;

public class Methods {

	public static void main(String[] args) {
	
		Methods m1 = new Methods();
		m1.doThis();
		m1.addition(100, 200);
		
		int x = m1.multiply(10, 20);
		System.out.println(x);
		
	}

	public void doThis() {
		System.out.println("Do This Executed");
	}
	public void addition(int a,int b) {
		System.out.println(a + b);
	}
	public int multiply(int a,int b) {
		int c = a*b;
		return c;
	}
	
}
