package oops_Concepts;

public class Temp {

	public static void main(String[] args) {
		
		Cars c1 = new Cars();
		
		c1.color = "Pink";
		c1.make = "BMW";
		
		c1.displayDetails();
		
        Cars c2 = new Cars();
		
		c2.color = "Black";
		c2.make = "Audi";
		c2.type = "Suzuki";
		
		c2.displayDetails();
		
		//Method Overloading
		
		Method_Overloading m2 = new Method_Overloading();
		m2.addition(10, 20);
		m2.addition(21.23, 45.54);
		m2.addition(64.45, 21);
		m2.addition(76, 85.21);
		m2.addition(20, 30, 50);
		
	}

}
