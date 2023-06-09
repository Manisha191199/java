package com.capg.java.practice;

import java.util.HashMap;
import java.util.*;
public class HashMapSortByKeyExample {
public static void main(String[] args) {
	HashMap<Integer,String> hs = new HashMap<>();
	hs.put(23,"Manisha");
	hs.put(56,"Abc");
	hs.put(10,"Hridhya");
	hs.put(34,"xyz");
	hs.put(98,"iopj");
	hs.put(37,"sbfa");
	hs.put(100,"mdfdbv");
	System.out.println("The hashmap conatins:");
	
	Set set = hs.entrySet();
	Iterator it = set.iterator();
	while(it.hasNext()) {
Map.Entry pair = (Map.Entry)it.next();	
System.out.println("The key is:"+pair.getKey()+" "+"and"+'\t'+"The value is:"+pair.getValue());
	}
TreeMap<Integer,String> ts = new TreeMap<>(hs);
System.out.println("After sorting by key:");
Set set2 = ts.entrySet();
Iterator it2 = set2.iterator();
while(it2.hasNext()) {
	Map.Entry pair2 = (Map.Entry)it2.next();
	System.out.println("The key is:"+pair2.getKey()+""+"and"+""+"The value is:"+pair2.getValue());
}

}
}