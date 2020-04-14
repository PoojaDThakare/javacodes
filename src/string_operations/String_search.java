package string_operations;

public class String_search {

	public static void main(String[] args) {
		 
		String str1 = "I am doing Java training Java given by Attra";
		String str2 = "Attra";
		
		System.out.println(str1.toLowerCase().contains(str2.toLowerCase())); // Contains is a case-sensitive
		
		System.out.println(str1.startsWith("I"));
		
		System.out.println(str1.endsWith("Attra21"));
		
		System.out.println(str1.indexOf("Java")); // Will return index of first occurrence of that particular string
		
		System.out.println(str1.indexOf("Java", 15 )); // Will return index of particular string after index 15 
		
		System.out.println(str1.lastIndexOf("Java"));// Will return last occurrence of particular string.(Reverse order)
		
	}

}
