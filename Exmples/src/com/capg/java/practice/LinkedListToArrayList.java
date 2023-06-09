package com.capg.java.practice;

import java.util.*;

class LinkedListToArrayList {
   public static void main(String args[]) {
   // Creating LinkedList Object    
   LinkedList<String> linkedlist = new LinkedList<String>();
   linkedlist.add("Mango");
   linkedlist.add("Banana"); 
   linkedlist.add("Pear");
   linkedlist.add("Apple");
   linkedlist.add("Orange");
   // Converting LinkedList to ArrayList
   List<String> list = new ArrayList(linkedlist);

   for (String s : list) {
     System.out.println(s);
   } 
 }
} 

