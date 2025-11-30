package com.demo.javaprograms;

import java.util.HashSet;

public class Array_004_Multiple_Missing_Number {

	public static void main(String[] args) {
		// Find Multiple Missing Number By Using HashSet
		int a[]= {1,2,3,5,7};
		int maxNumber = 7;
		HashSet<Integer> fullSet = new HashSet<Integer>();
		for(int i=1; i<=maxNumber; i++) {
			fullSet.add(i);
		}
		for(int b:a) {
			fullSet.remove(b);
		}
		System.out.println("Missing Number: "+fullSet);

	}

}
