package com.capg.java.practice;

import java.util.*;

public class HashMapSynchronizeExample {
   public static void main(String args[]) {
       
   // Creating a HashMap of Integer keys and String values
   HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
   hashmap.put(27, "Value1");
   hashmap.put(17, "Value2");
   hashmap.put(16, "Value3");
   hashmap.put(92, "Value4");
   hashmap.put(50, "Value5");
   Map map= Collections.synchronizedMap(hashmap);
   Set set = map.entrySet();
   synchronized(map){
       Iterator i = set.iterator();
       // Display elements
       while(i.hasNext()) {
           Map.Entry pair = (Map.Entry)i.next();
           System.out.print(pair.getKey() + ": ");
           System.out.println(pair.getValue());
       }
   }
 }
}
