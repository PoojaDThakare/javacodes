package interfaces;

public interface Interface1 {

	static final int a = 100;
	
	void doThis();
	
	static void xyz() {
		System.out.println("Static XYZ from Interface1");
	}
	
	default void pqr() {
		System.out.println("Default UVF from Interface1");		
	}
	
}
