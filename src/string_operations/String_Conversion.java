package string_operations;

public class String_Conversion {

	public static void main(String[] args) {
		
		int num1 = 100;
		// Converting an integer into a string 
		System.out.println(Integer.toString(num1));
		System.out.println(Integer.toBinaryString(num1));
		System.out.println(Integer.toHexString(num1));
		System.out.println(Integer.toOctalString(num1));
		
		// Converting integer into string
		String str1 = "100";
		String str2 = "1100100";
		String str3 = "64";
		String str4 = "144";
		
		System.out.println(Integer.parseInt(str1));
		System.out.println(Integer.parseInt(str2, 2)); // Binary
		System.out.println(Integer.parseInt(str3, 16)); // Hex
		System.out.println(Integer.parseInt(str4, 8)); // Octal
	}

}
