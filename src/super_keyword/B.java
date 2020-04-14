package super_keyword;

public class B extends A {

	int num1 = 200;
	
	public void doThis() {
		System.out.println("Do this from B");
	}

	public void xyz() {
		System.out.println(num1); // Without super we will get the child class value
		System.out.println(super.num1); // With super we will get the Parent class value
		super.doThis(); // To execute method from Parent class and not from Child class we use keyword "super"
		System.out.println("XYZ Executed");
	}
	
}
