package collections;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapHashTable {


	public static void main(String[] args) {

		HashMap<Integer, String> hm  = new HashMap<Integer, String>();
		hm.put(1,"Selenium WebDriver");
		hm.put(2,"Rest API Automation");
		hm.put(3,"Appium");
	    System.out.println("HashMap Output : "+hm);		
		
	    
	    
	    Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	    ht.put(1,"Selenium WebDriver");
	    ht.put(2,"Rest API Automation");
	    ht.put(3,"Appium");
	    System.out.println("Hashtable Output : "+ht);	
	}

}
