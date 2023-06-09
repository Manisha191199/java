package com.capg.java.string.practice;

public class RemoveDuplicatesInAString {
	public static void main(String[] args) {
		String input = "hello world";
		StringBuilder output = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
		    char c = input.charAt(i);
		    // Check if the character has already been added to the output
		    if (output.indexOf(Character.toString(c)) < 0) {
		        output.append(c);
		    }
		}

		String result = output.toString();
		System.out.println(result); // Output: "helo wrd"

	}

}
