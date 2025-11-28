package com.demo.javaprograms;

public class Math_006_PrimeNumber {

	public static void main(String[] args) {
		//Number should be > 1
		//number should be divisible by 1 and by same number
		//19 -> divisible by 1 and 19
		//20 -> divisible by 1, 20, 2, 4, 5
		int number = 20;
		int count =0;
		for(int i=1; i<=number; i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Given Number "+number+" is prime number");
		}else {
			System.out.println("Given Number "+number+" not a prime number");
		}
	}

}
