package maps;

import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		
		var map = new TreeMap<Character, Integer>();
		
		map.put('b', 1000);
		map.put('a', 2000);
		map.put('c', 3000);
		map.put('d', 4000);
		
		System.out.println(map.containsValue(2000));
		map.replace('a', 5000);
		//System.out.println(map.firstEntry());
		//System.out.println(map.lastEntry());
		//System.out.println(map.firstKey());
		//System.out.println(map.lastKey());
		
		//System.out.println(map.pollFirstEntry());
		//System.out.println(map.pollLastEntry());
		
		System.out.println(map);
		
	}

}
