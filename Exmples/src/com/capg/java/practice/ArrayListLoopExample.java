package com.capg.java.practice;
import java.util.*;
public class ArrayListLoopExample {
public static void main(String[] args) {
	List<Integer> a= new ArrayList<Integer>();
	a.add(0);
	a.add(1);
	a.add(2);
	a.add(3);
	System.out.println("Traversing through advanced for loop");
	for(Integer num:a) {
		System.out.println(num);
	}
}
}
