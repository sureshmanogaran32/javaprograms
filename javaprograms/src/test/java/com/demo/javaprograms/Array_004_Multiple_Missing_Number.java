package com.demo.javaprograms;

import java.util.HashSet;

public class Array_004_Multiple_Missing_Number {

	public static void main(String[] args) {
		// Find Multiple Missing Number By Using HashSet
		int a[]= {1,2,3,5,7};
		int maxNumber;
		int max =a[0];
		for(int i=0; i<=a.length-1; i++) {
			if(max < a[i]) {
				max=a[i];
			}
		}
		System.out.println("Maximum number :"+max);
		maxNumber=max;
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
