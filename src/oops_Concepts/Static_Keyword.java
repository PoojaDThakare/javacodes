package oops_Concepts;

public class Static_Keyword {

	static String name = "ABC";
	byte age = 6;
	String grade = "1st";
	
	public void displsyDetails() {
		System.out.println("Student " +name + " is " +age+ " years old and is in " +grade+ " grade" );
	}
	
	public static void doThis() {
		System.out.println("Do This Method");
	}
}
