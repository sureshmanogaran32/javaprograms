package com.demo.javaprograms;

public class Array_001_Odd_Even_Number {

	public static void main(String[] args) {
		//Count the Odd and Even Number
		int numbers[]= {1,2,3,4,5};
		int oddCount=0;
		int evenCount=0;
		for(int var:numbers) {
			if(var%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
			System.out.println("Even Numbers: "+evenCount);
			System.out.println("Odd Numbers: "+oddCount);
	}

}
