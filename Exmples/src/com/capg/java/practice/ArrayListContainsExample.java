package com.capg.java.practice;
import java.util.*;
public class ArrayListContainsExample {
	public static void main(String[] args) {
		List <Integer> a= new ArrayList<Integer>();
			a.add(1);
			a.add(2);
			a.add(3);
			a.add(4);
			a.add(5);
			Scanner sc = new Scanner(System.in);
			System.out.println("The number should be found is: ");
			int b=sc.nextInt();
			
			if(a.contains(b)) {
				System.out.println("Found the number");
			}
			else
			{
				System.out.println("Not found");
			}
	}
}
