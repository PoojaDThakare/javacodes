package lists;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		//List<String> arr1 = new ArrayList<String>();
		
		arr.add("Pink");
		arr.add("Red");
		arr.add("Blue");
		arr.add("Green");
		arr.add("Orange");
		arr.add("White");
		arr.add("Black");
		arr.add("Brown");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(5));
		arr.set(5, "Pink");
		System.out.println(arr.get(5));
		//arr.clear();
		//arr.remove(1); //Remove by using index
		//arr.remove("Green"); //Remove by using value
		System.out.println(arr.indexOf("Pink"));
		System.out.println(arr.lastIndexOf("Pink"));
		System.out.println(arr.contains("Blue"));
		List<String> arr2 = arr.subList(2, 5);
		System.out.println(arr2);
        System.out.println("---------------------");
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		
		System.out.println("Elements are: " +arr);
		System.out.println("---------------------");
		
		for (String x : arr) {
			System.out.println(x);
		}
		
	}

}
