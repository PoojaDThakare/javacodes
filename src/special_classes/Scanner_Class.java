package special_classes;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		
		String str1  = s1.nextLine();
		int a = s1.nextInt(); // For integer
		String temp = "";
		
		for (int i = 0; i <= str1.length()-1; i++ ) {
		
			temp = str1.charAt(i) + temp;
			
		}
		System.out.println("Reversed string is " +temp);
		
	}

}
