package com.capg.java.practice.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ReverseInt {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 23, 46,78,56,90);
	List<Integer> reversed = numbers.stream().sorted((a,b)-> b.compareTo(a)).collect(Collectors.toList());
	System.out.println(reversed);
			
}
}
