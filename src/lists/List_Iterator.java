package lists;
import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		
        var list = new ArrayList<Double>();
		
		list.add(2.1);
		list.add(2.2);
		list.add(2.3);
		list.add(2.4);
		list.add(2.5);
		
		ListIterator itr = list.listIterator(list.size());
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
	}

}
