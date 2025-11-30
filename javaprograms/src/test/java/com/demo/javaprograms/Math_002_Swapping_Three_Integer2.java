package com.demo.javaprograms;

public class Math_002_Swapping_Three_Integer2 {

	public static void main(String[] args) {
		int a =10; int b=20; int c=30;
		int temp;
		System.out.println("Before Swapping A = "+a);
		System.out.println("Before Swapping B = "+b);
		System.out.println("Before Swapping C = "+c);
	//Approach 1
		/*
		temp = a;
		a=b;
		b=c;
		c=temp;
		*/
	//Approach 2
		a=a+b+c; //10+20+30 =60
		b=a-(b+c); //60-(20+30) = 10
		c=a-(b+c); //60-(10+30) = 20
		a=a-(b+c); //60-(10+20) = 30
		
		System.out.println("After Swapping A = "+a);
		System.out.println("After Swapping B = "+b);
		System.out.println("After Swapping C = "+c);
	}

}
