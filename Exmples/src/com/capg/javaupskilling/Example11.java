package com.capg.javaupskilling;
import java.util.*;
public class Example11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.print("Even numbers from 2 to " + n + ": ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
