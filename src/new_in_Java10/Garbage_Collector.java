package new_in_Java10;

public class Garbage_Collector {

	public static void main(String[] args) {
		
		String str1 = "SADJSNFSDFFMSKDMSLKMDSMDLS";
		for (int i = 0; i <= str1.length()-1; i++ ) {
			String temp = "ch"+i+":"+str1.charAt(i);	
			System.out.println(temp);
	  }
	}
}
