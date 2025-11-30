package com.demo.javaprograms;

import java.util.Arrays;

public class Array_002_EqualOfArray {

	public static void main(String[] args) {
		//Check the array whether both are equal
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5,6};
		
		boolean equals = Arrays.equals(a, b);
		System.out.println(equals);

	}

}
