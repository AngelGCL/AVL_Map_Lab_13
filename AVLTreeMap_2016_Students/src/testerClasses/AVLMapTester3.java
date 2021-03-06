package testerClasses;

import mapClasses.BSTMap;
import interfaces.Map;
import interfaces.Entry; 

public class AVLMapTester3 {

	public static void main(String[] args) {
		BSTMap<Integer, String> map = 
			new BSTMap<Integer, String>(new NumberComparator1()); 
		mapInsert(-10, "minus ten", map); 
		mapInsert(-5, "minus five", map); 
		mapInsert(1, "one", map); 
		mapInsert(4, "four", map); 
		
		mapRemove(-5, map); 
		
		mapInsert(8, "eight", map);  
		mapInsert(9, "nine", map);  
	 	mapInsert(10, "ten", map);  
		mapInsert(7, "seven", map);  
		mapInsert(13, "thirteen", map); 
		
		mapRemove(-10, map); 
		
		mapInsert(19, "nineteen", map); 
		mapInsert(11, "eleven", map);  
		
		mapRemove(10, map); 
		mapRemove(11, map); 

		
		mapInsert(30, "thirty", map); 
		mapRemove(9, map); 

		mapInsert(40, "forty", map); 
		mapInsert(35, "thirty five", map);  
		mapInsert(50, "fifty", map);  
		mapInsert(25, "twenty five", map);  
		mapInsert(17, "seventeen", map);  
		mapInsert(23, "twenty three", map);  
		mapInsert(16, "sixteen", map);  
		mapInsert(14, "fourteen", map);  
		mapInsert(47, "forty seven", map);  
		
		mapRemove(25, map); 
		mapRemove(47, map); 
		mapRemove(50, map); 
		mapRemove(23, map); 



		mapInsert(29, "twenty nine", map);  
		mapInsert(33, "thirty three", map); 
		mapInsert(15, "fifteen", map);  
		
		showMap("Original Map", map);  
		
		mapInsert(19, "nineteen 2", map); 
		showMap("Map content after adding 19 ...", map); 
		
		map.remove(13); 
		showMap("Map content after removing 13 ...", map); 

		map.remove(1); 
		showMap("Map content after removing 1 ...", map); 
		
		
		showMapEntries("Entries in the map (visiting nodes in inorder)", map); 
		
		mapRemove(7, map); 
		mapRemove(17, map); 
		mapRemove(4, map); 
		mapRemove(14, map); 
		mapRemove(8, map); 
		mapRemove(19, map); 
		mapRemove(30, map); 
		mapRemove(35, map); 
		mapRemove(29, map); 
		mapRemove(33, map); 
		mapRemove(40, map); 
		mapRemove(16, map); 
		mapRemove(15, map); 


	}
	
	private static void mapInsert(int key, String value, BSTMap<Integer, String> map) { 
		System.out.println("\nMap after inserting [key = " + key + ", " + " values = " + value + "]"); 
		map.put(key, value); 
		map.displayTree();
		
	}
	private static void mapRemove(int key, BSTMap<Integer, String> map) { 
		System.out.println("\nMap after removing [key = " + key + ", " + " VALUE = " + map.remove(key) + "]"); 
		map.displayTree();
		
	}
	private static <K,V> void showMap(final String msg, final Map<K,V> m) { 
		System.out.println("\n" + msg); 
		BSTMap<K,V> bstm = (BSTMap<K,V>) m; 
		bstm.displayTree(); 
	}
	private static <K,V> void showMapValues(final String msg, final Map<K,V> m) { 
		System.out.println("\n" + msg); 
		for (V value : m.values()) 
			System.out.println(value); 
	}

	private static <K,V> void showMapKeys(final String msg, final Map<K,V> m) { 
		System.out.println("\n" + msg); 
		for (K key : m.keySet()) 
			System.out.println(key); 
	}

	private static <K,V> void showMapEntries(final String msg, final Map<K,V> m) { 
		System.out.println("\n" + msg); 
		for (Entry<K,V> e : m.entrySet()) 
			System.out.println(e); 
	}

}
