
//https://beginnersbook.com/2014/07/hashtable-in-java-with-example/

import java.util.Hashtable;
import java.util.Enumeration;

public class JavaHashTable {
    public static void main(String[] args) {
        Enumeration i;
        String key;
        
        
        Hashtable<String,String> htable = new Hashtable<String,String>();
        
        htable.put("test","test");
        htable.put("test2","test2");
        
        i = htable.keys();
        while(i.hasMoreElements()){
            key = (String) i.nextElement();
            System.out.println("Key: " + key + " Value: " + htable.get(key));
        }
        
    }
}
