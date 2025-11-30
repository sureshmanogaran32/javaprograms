package com.demo.javaprograms;

public class Array_003_Missing_Number {

	public static void main(String[] args) {
		// Missing Number from Array 
		int a[]= {1,2,3,4,5,6,8};
		int actualSum=0;
		int excpectedSum=0;
		//Approach 1 using formula n*(n+1)/2
		int n = a.length+1;
		int sum=0;
		int expected = n*(n+1)/2;
		System.out.println("The Actual Sum of Array: "+expected);
		for(int b:a) {
			sum = sum+b;
		}
		System.out.println("Sum of Array: "+sum);
		int output = expected - sum;
		System.out.println("Missing Number: "+output);
		//Approach 2 using for loop
		for(int number:a) {
			actualSum=number+actualSum;
		}
		System.out.println("The Actual Sum of Array: "+actualSum);
		for(int i=1; i<=8; i++) {
			excpectedSum=i+excpectedSum;
		}
		System.out.println("The Expected Sum of Array: "+excpectedSum);
		int missingNumber=excpectedSum-actualSum;
		System.out.println("Missing Number :"+missingNumber);
	}

}
