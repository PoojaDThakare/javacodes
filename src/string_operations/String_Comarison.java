package string_operations;

public class String_Comarison {

	public static void main(String[] args) {
		
		String str1 = "NSDJW";
		String str2 = "NSdJW";
		
		System.out.println(str1.equals(str2)); // Equals does case-sensitive comparison
		System.out.println(str1.equalsIgnoreCase(str2)); // Equalsignorecase does non-sensitive comparison
		
		if (str1.equals(str2)) {
           System.out.println("Strings are equal");
	}else {
		System.out.println("Strings are not equal");
	}
		// Compare to
		
		System.out.println(str1.compareTo(str2)); // Case-sensitive comparison
		System.out.println(str1.compareToIgnoreCase(str2));//Non-senstive comparison
		
		// Matches
		
		String patt = "[A-Z]{1,}";
		System.out.println(str1.matches(patt));
		

	}
}	
