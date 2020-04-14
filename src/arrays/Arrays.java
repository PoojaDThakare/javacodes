package arrays;

public class Arrays {

	public static void main(String[] args) {
		
		String [] DaysofWeek = {"Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};
		System.out.println(DaysofWeek.length);
		
		System.out.println(DaysofWeek[2]);
		
		DaysofWeek[2] = "PPP";
		System.out.println(DaysofWeek[2]);
		
		for (int i = 0; i <= DaysofWeek.length-1; i++) {
			System.out.println(DaysofWeek[i]);
		}
		
		int [] arr1 = {12,43,54,3,2,424,232,6565,565,878};
		char [] arr2 = {'P', 'S', 'M', 'D', 'K'};
		
		
	}

}
