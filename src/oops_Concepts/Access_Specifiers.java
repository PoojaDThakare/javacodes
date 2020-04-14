package oops_Concepts;

public class Access_Specifiers {

	public int a = 100;
	int b = 200;
	private int c= 300;
	
	
	public void doThisPublic() {
		System.out.println("Public Method");
	}
	
	private void doThisPrivate() {
		System.out.println("Private Method");
	}	
		
	void doThisDefault() {
		System.out.println("Default Method");

	}
}
