package new_in_Java10;

import java.util.Scanner;

public class Var_Keyword {

	String st1 = "";
	//var st2 = ""; // We cannot use var at class level
	
	public static void main(String[] args) {
	
		int num1 = 100;
		var num2 = 200;
		
		var str1 = "hsdhaskjdak";
		var num3 = 221.342;
		
		Scanner s1 = new Scanner(System.in); //Old before Java 10
		
		var s2 = new Scanner(System.in); //New in Java 10
		
		var x = add(100, 200);
		 
		System.out.println("The addition is " +x);
	}
	
	public static int add(int a, int b) {
		return a+b;
	}

}
