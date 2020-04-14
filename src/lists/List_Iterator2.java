package lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator2 {

	public static void main(String[] args) {
		
        var list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(23);
		list.add(41);
		list.add(400);
		list.add(50);
		list.add(21);
		list.add(97);
		list.add(991);
		
        ListIterator itr = list.listIterator();
		
		while(itr.hasNext()) {
		
			int i = (int) itr.next();
			if (i % 2 == 1) {
				i++;
				itr.set(i);
			}
		}
		System.out.println(list);
	}

}
