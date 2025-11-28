package com.demo.javaprograms;

public class Math_007_Fibonicis {

	public static void main(String[] args) {
		// Sum of the two preceding numbers
		// n=5, 0, 1, 1, 2, 3, 5
		//0+1=1 , 1+2=3, 3+2=5
		
		int n1=0; int n2=1; int sum=0;
		int fibNumber=10;
		System.out.print(n1+" ");
		for(int i=1; i<fibNumber;i++) {
			sum=n1+n2;
			System.out.print(sum +" ");
			n1=n2;
			n2=sum;
		}
	}
}
