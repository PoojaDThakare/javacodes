package lists;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		
		var list = new LinkedList<Double>();
		
		list.add(2.1);
		list.add(2.2);
		list.add(2.3);
		list.add(2.4);
		list.add(2.5);
		list.add(2.6);
		
		//System.out.println(list.get(2));
		list.set(2, 3.3);
		//System.out.println(list.get(2));
		list.add(3,7.9);
		//list.clear();
		//list.remove(0);
		//list.remove(2.4);
		
		//System.out.println(list.indexOf(2.9));
		//System.out.println(list.lastIndexOf(2.1));
		//System.out.println(list.contains(2.5));
		
		//System.out.println(list.peekFirst());
		//System.out.println(list.peekLast());
		
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
		
		System.out.println(list);
		//System.out.println(list.subList(2, 4));
		
		
	}

}
