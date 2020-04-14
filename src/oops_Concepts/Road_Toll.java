package oops_Concepts;

public class Road_Toll {

	String type;
	int tirescount;
	
	public void calculateToll() {
		if (tirescount == 2) {
			System.out.println("Toll amount in 0");
		} else if (tirescount == 4) {
			System.out.println("Toll amount in 10");
		} else if (tirescount > 4) {
			System.out.println("Toll amount in 20");
		} else {
			System.out.println("Incorrect tyre count");
		}
	}
		public Road_Toll() {
			 	System.out.println("Construcot is exceuted");
		}
		
		public Road_Toll(String type, int tirescount) {
			this.type = type;
			this.tirescount = tirescount;			
		}
		
	}

