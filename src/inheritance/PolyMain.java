package inheritance;

public class PolyMain {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle();
		t1.setBaseandHeight(20.23, 43.54);
		t1.calArea();
		
		Rectangle r1 = new Rectangle();
		r1.setBaseandHeight(30.32, 10.25);
		r1.calArea();
		
	}

}
