package com.capg.java.practice;
import java.util.*;

public class SortHashMapByKey {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(67, "Manisha");
        map.put(23, "Hridhya");
        map.put(89, "Meghna");
        map.put(90, "Dipu");
        
        // Sort the HashMap by keys
        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);
        
        // Print the sorted HashMap
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
