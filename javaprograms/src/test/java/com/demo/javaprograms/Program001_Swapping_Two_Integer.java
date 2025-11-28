package com.demo.javaprograms;

import java.util.Scanner;

public class Program001_Swapping_Two_Integer {

	public static void main(String[] args) {
		int a =10; int b=20;
		int temp;
		System.out.println("Before Swapping A = "+a);
		System.out.println("Before Swapping B = "+b);
	//Approach 1
		/*
		temp = a;
		a=b;
		b=temp;
		*/
	//Approach 2
		a=a+b; //10+20 =30
		b=a-b; //30-20 = 10
		a=a-b; //30-10 =20
		
		System.out.println("After Swapping A = "+a);
		System.out.println("After Swapping B = "+b);
	}

}
