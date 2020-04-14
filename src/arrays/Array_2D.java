package arrays;

public class Array_2D {

	public static void main(String[] args) {
		
		String [] [] arr = 
			    {
				{"A","B","C"},
				{"E","F"},
				{"CDC","CSD","FERDF","JHB"}
				};
		
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		
		System.out.println(arr[2][1]); // Retrieve value from a 2D array
		arr[2][1] = "HDBHS"; // Update a 2D array
		System.out.println(arr[2][1]); 
		
		for (String[] x : arr) {
			for (String y : x) {
				System.out.println(y);
			}
			System.out.println("--------------------------");
		}
	}

}
