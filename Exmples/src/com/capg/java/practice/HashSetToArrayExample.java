package com.capg.java.practice;
import java.util.HashSet;

public class HashSetToArrayExample {
   public static void main(String[] args) {
      
      // Create a HashSet
      HashSet<String> hashSet = new HashSet<String>();
      hashSet.add("apple");
      hashSet.add("banana");
      hashSet.add("orange");
      
      // Convert HashSet to array
      String[] array = hashSet.toArray(new String[hashSet.size()]);
      
      // Print the array elements
      for (String s : array) {
         System.out.println(s);
      }
   }
}
