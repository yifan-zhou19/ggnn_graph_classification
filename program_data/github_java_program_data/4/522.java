package ds_collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class HashMapvsHashTable {
	
	public static void main(String[] args){
		
		Integer[] a = {100,20,45,67,89,1};
		Character[] c = {'e','b','f','d','a','c'};
		
		HashMap<Integer,Character> hmap = new HashMap<Integer,Character>();
		Hashtable<Integer,Character> htable = new Hashtable<Integer,Character>();
		
		for(int i=0;i<a.length;i++){
			hmap.put(a[i], c[i]);
			htable.put(a[i], c[i]);
		}

		Iterator<Integer> k = hmap.keySet().iterator();
		Iterator<Character> v = hmap.values().iterator();
		
		Iterator<Integer> k1 = htable.keySet().iterator();
		Iterator<Character> v1 = htable.values().iterator();
		
		while(k.hasNext())
			System.out.printf("%d ", k.next());
		
		System.out.println("\n");
		
		while(k1.hasNext())
			System.out.printf("%d ", k1.next());	
	}
}