package com.capg.javaupskilling;
import java.util.*;
public class Example7 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int num = input.nextInt();

	        if (num % 2 == 0) {
	            System.out.println(num + " is even");
	        } else {
	            System.out.println(num + " is odd");
	        }
	    }
}
