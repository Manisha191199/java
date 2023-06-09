package com.capg.javaupskilling;
import java.util.*;
public class Example6 {
	 public static void main(String[] args) {
	        // take input from user
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first integer: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter the second integer: ");
	        int num2 = sc.nextInt();
	        
	        // compare the two numbers
	        if (num1 > num2) {
	            System.out.println(num1 + " is greater than " + num2);
	        } else if (num1 < num2) {
	            System.out.println(num1 + " is less than " + num2);
	        } else {
	            System.out.println(num1 + " is equal to " + num2);
	        }
	    }
}
