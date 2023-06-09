package com.capg.javaupskilling;
import java.util.*;
public class Example10 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int num = sc.nextInt();
	        sc.close();
	        
	        for (int i = 1; i <= num; i++) {
	            System.out.print(i + " ");
	        }
	    }
}
