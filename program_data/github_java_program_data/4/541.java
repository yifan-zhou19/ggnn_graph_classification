package com.paxovision.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;


public class HashTableHashMap {

	public static void main(String[] args) {
		
		//hash is a representation of value
		//key
		//values
		
		//hash set : No duplicates
		//and hashmap:Stores key value pairs 
		
		/*HashSet<Integer> phoneNumber = new HashSet<Integer>();
		phoneNumber.add(5551231);
		phoneNumber.add(5551231);
		phoneNumber.add(5551235);
		phoneNumber.remove(5551234);
		phoneNumber.add(5551234);
		System.out.println(phoneNumber);*/
		
		HashMap<String, Integer>directory = new HashMap<String, Integer>();
		directory.put("Alim ",  5551231);
		directory.put("Zakir ", 5551232);
		
		System.out.println(directory);
		
		//System.out.println(directory.get("Zakir "));
		
		
		Hashtable<String, Integer> directory2 = new Hashtable<String, Integer>();
		directory2.put("Alim", 5551231);
		directory2.put("Zakir", 5551232);
		
		System.out.println(directory2);
		
		
		//................new Example...................
		
		System.out.println("*****************************************");
		
		Hashtable<String, String> objectMaps = new Hashtable<String, String>();
		objectMaps.put("Orange Tastes ", " Good");
		objectMaps.put("Honey Tastes", " Sweet");
		
		System.out.println("If we USE HASH TABLE: " + objectMaps);
		
		
		HashMap objectMap = new HashMap();
		objectMap.put("Orange Tastes ", " Good");
		objectMap.put("Honey Tastes ", " Sweet");
		
		System.out.println("If we USE HASH MAP: " + objectMap);
		
		System.out.println("*****************************************");
		
		HashMap<String, String> hashmapobj = new HashMap<String, String>();
        hashmapobj.put("Alive is ", " Good");  
        hashmapobj.put("Love", " yourself"); 
        System.out.println("HashMap object output :"+hashmapobj);
        
        System.out.println("*****************************************");
        
        Hashtable<String,String> hashtableobj = new Hashtable<String, String>();
        hashtableobj.put("Alive is ", " Good");
        hashtableobj.put("Love ", " yourself");
        System.out.println("Hashtable object output :"+ hashtableobj);
		
	
	}

}
