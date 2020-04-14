package string_operations;

public class String_Replace {

	public static void main(String[] args) {
		
		String str1 = "PR1234CTICE M1234KES 1234 M1234N PERFECT";
		String str2 = "1234";
		String str3 = "A";
		
		System.out.println(str1.replace(str2, str3));
		
		String str4 = "EV#$%ERY*$TH*&ING HA^@#$PPE&^*NS FO(^#^)R A RE@$%#AS^#*@ON@%^!&*(";
		String patt = "[^A-Za-z0-9\\s]"; //Captal A-Z, small a-z, 0-9 numbers and \\s- space 
		
		System.out.println(str4.replaceAll(patt, ""));
	}

}
