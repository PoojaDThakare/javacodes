package pkg_1;

public class String_basics {

	public static void main(String[] args) {
	
		String str1 = "Core Java ";
		String str2 = "Practice session";		
		
		String str3 = str1 + str2; // Concatenate 	 	
		System.out.println(str3);
		
		String str4 = str1.concat(str2); //Concatenate
		System.out.println(str4);
	
		int num1 = 100;
		System.out.println(str1 + num1); // Concatenation of string and integer
		
		// To find the length of the string
		
		System.out.println(str1.length());
		
		// To trim the string (Begining spaces and spaces at the end of the string)
		
		String str5 = "     dferferfer   frefwf   ffwferf    ";
		System.out.println(str5.trim()); // With trim
		System.out.println(str5);        // Witout trim
		
		System.out.println(str5.toUpperCase()); // To convert the string into uppercase
		
		String str6 = "  AGSjusjGHUUMNHULL  mndhdjfmndfk";
		System.out.println(str6.toLowerCase());
		
		// To check whether a string is empty or not.
		
		System.out.println(str6.isEmpty());
		
		String str7 = "";
		System.out.println(str7.isEmpty());
		
      // End of String basics.
	
	}

}
