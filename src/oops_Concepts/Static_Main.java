package oops_Concepts;

public class Static_Main {

	public static void main(String[] args) {
		
		Static_Keyword sk1 = new Static_Keyword();
		
		Static_Keyword sk2 = new Static_Keyword();
		
		sk1.age = 5;
		Static_Keyword.name = "Neha";
		sk1.grade = "2nd";
		Static_Keyword.doThis();
		
		sk2.age = 7;
		Static_Keyword.name = "Suraj";
		sk2.grade = "3rd";
		Static_Keyword.doThis();
		
		sk1.displsyDetails();
		sk2.displsyDetails();
				
	}

}
