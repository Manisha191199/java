package com.capg.javaupskilling;
import java.util.*;
public class Example8 {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");

        
        int num = sc.nextInt();

        // check if the integer is positive, negative or zero
        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println("The number is zero");
        }

        // close scanner object
        sc.close();
}
}
