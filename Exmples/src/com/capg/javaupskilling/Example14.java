package com.capg.javaupskilling;
import java.util.*;
public class Example14 {
	 Scanner input = new Scanner(System.in);
     System.out.println("Enter an integer: ");
     int num = input.nextInt();
     int firstNum = 0;
     int secondNum = 1;
     int sum = 0;
     System.out.println("Fibonacci sequence up to " + num + ": ");
     while (firstNum <= num) {
         System.out.print(firstNum + " ");
         sum = firstNum + secondNum;
         firstNum = secondNum;
         secondNum = sum;
     }
 }

