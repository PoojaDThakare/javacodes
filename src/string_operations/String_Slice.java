package string_operations;

public class String_Slice {

	public static void main(String[] args) {

		String str1 = "ABCDEFGHI";
		System.out.println(str1.charAt(2));
		
		// Program to reverse the string
		String str2 = "";
		for (int i=0; i<= str1.length()-1; i ++) {
			str2 = str1.charAt(i)+str2;
			
		}
		System.out.println(str2); 
		// End of reverse program
		
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(2, 5)); //Begin index is included and end index is not included
		
		String str3 = "A,B,C,D,E";
		String str4 = ",";
		
		String [] arr = str3.split(str4);// Split the string where it will find a delimiter
		//System.out.println(arr);
		//System.out.println(str3.split(str4));
		for (String x : arr) {
			System.out.println(x);
		}
	}

}
