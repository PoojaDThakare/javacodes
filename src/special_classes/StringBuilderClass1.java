package special_classes;

public class StringBuilderClass1 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Learning is Fun");
		
		sb1.insert(9, "Java ");
		System.out.println(sb1);

		sb1.replace(9, 13, "Everything ");
		System.out.println(sb1);
		
		String str1 = "HADSAJDNSDJSJDSJDCNSAJDSNADSJAADEJDsDCNDN";
		System.out.println(str1.replace("DS", "$"));
		
		sb1.deleteCharAt(0);
		System.out.println(sb1);
		
		sb1.delete(2, 9);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
	}

}
