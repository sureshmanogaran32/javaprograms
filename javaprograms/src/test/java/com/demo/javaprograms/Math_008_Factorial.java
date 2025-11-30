package com.demo.javaprograms;

public class Math_008_Factorial {
	public static void main(String[] args) {
		//Factorial 1*2*3*4*5
		int number = 5;
		int start =1;
		for(int i=1; i<=number; i++) {
			start=start*i;
		}
		System.out.println("Factorial Value: "+start);
	}
}
