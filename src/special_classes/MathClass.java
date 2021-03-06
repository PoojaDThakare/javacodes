package special_classes;

public class MathClass {

	public static void main(String[] args) {
	
		int num1 = 100;
		int num2 = 200;
		
		System.out.println(Math.max(num1, num2));
		System.out.println(Math.min(num1, num2));
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.sqrt(77));
		System.out.println(Math.cbrt(99));
		
		System.out.println("---------------------------------");
		
		double x = 12.98;
		double y = 10.50;
		
		System.out.println(Math.ceil(x));
		System.out.println(Math.ceil(y));
		
		System.out.println(Math.floor(x));
		System.out.println(Math.floor(y));
		
		System.out.println(Math.round(x));
		System.out.println(Math.round(y));
		
		System.out.println("---------------------------------");
		
		System.out.println(Math.random());
		
	}

}
