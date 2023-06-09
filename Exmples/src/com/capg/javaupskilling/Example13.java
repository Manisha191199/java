package com.capg.javaupskilling;
import java.util.*;
public class Example13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        
        if (number <= 1) {
            isPrime = false;
        }
        else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}






//The program first prompts the user to enter an integer, which is then stored in the number variable. It then checks whether the number is less than or equal to 1, in which case it is not considered a prime number, and sets the isPrime variable to false.

//If the number is greater than 1, the program initializes a loop variable i to 2 and uses a while loop to check whether i is a factor of number. The loop continues as long as i is less than or equal to the square root of number, since any factors of number greater than its square root would have corresponding factors less than its square root. If i is a factor of number, isPrime is set to false and the loop is terminated.

//After the loop completes, the program checks the value of isPrime. If it is true, the program prints a message indicating that the number is a prime number. Otherwise, it prints a message indicating that the number is not a prime number.
