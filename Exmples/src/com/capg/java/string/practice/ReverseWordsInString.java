package com.capg.java.string.practice;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split("\\s+");
        String reversedString = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i] + " ";
        }
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedString.trim());
    }
}
