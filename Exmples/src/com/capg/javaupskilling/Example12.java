package com.capg.javaupskilling;
import java.util.*;
public class Example12 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int number = sc.nextInt();
	        sc.close();
	        
	        int factorial = 1;
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;//In each iteration of the loop, we multiply the factorial variable by the loop variable i.
	        }
	        
	        System.out.println("Factorial of " + number + " is: " + factorial);
	    }
}
