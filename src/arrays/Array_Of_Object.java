package arrays;

public class Array_Of_Object {

	public static void main(String[] args) {
		
		Object [][] arr = 
			    {
				{"Pooja", 25, 55.77, "F"},
				{"Neha", 30, 65.77, "F"},
				{"John", 32, 70.42, "M"},
				{"Rakesh", 45, 66.66, "M"},
				{"Vikas", 18, 32.45, "M"}
				};
		
		for (Object [] x : arr) {
			for (Object y : x) {
				System.out.print(y+ " ");
			}
			System.out.print("\n");
		}
	}

}
