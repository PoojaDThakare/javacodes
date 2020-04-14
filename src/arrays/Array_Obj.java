package arrays;

public class Array_Obj {

	public static void main(String[] args) {
		
		int [] arr1 = new int [10];
		
		arr1 [0] = 20;
		arr1 [1] = 70;
		arr1 [5] = 90;
		arr1 [7] = 50;
		arr1 [9] = 100;
		
		for (int i = 0; i <= arr1.length-1; i++) {
			System.out.println(arr1[i]);
		}
	}

}
