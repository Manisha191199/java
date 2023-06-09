package com.capg.java.string.practice;
import java.util.*;
public class StringRotation {
public static void  main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("The original string:");
	String input = sc.nextLine();
	System.out.println("The rotated string:");
	String rotation = sc.nextLine();
	if(checkRotated(input,rotation)) {
		System.out.println(input+"and"+rotation+"are rotation of each other");
		
	}
	else {
		System.out.println("They are not rotation of each other");
	}
	sc.close();
}
	public static boolean checkRotated(String original,String rotation) {
		if(original.length()!=rotation.length()) {
			return false;
		}
		String concatenated = original + original;
		if(concatenated.indexOf(rotation)!= -1) {
			return true;
		}
		return false;
	}
}
