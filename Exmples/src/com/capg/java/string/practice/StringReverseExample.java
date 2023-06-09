package com.capg.java.string.practice;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class StringReverseExample {
	public static void main(String args[]) throws FileNotFoundException, IOException{
	Scanner sc = new Scanner(System.in);
		System.out.println("The original string:");
		String str = sc.nextLine();
		sc.close();
		String reverseStr = reverse(str);
		System.out.println(reverseStr);
		
	}
	public static String reverse(String str) {
		StringBuilder str2 = new StringBuilder();
		char strChars[]=str.toCharArray();
		for(int i=str.length()-1; i<=0;i--) {
			str2.append(strChars[i]);
		}
		return str2.toString();
	}
}
