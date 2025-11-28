package com.demo.javaprograms;

public class Program006_Count_Odd_Even_Numbers {

	public static void main(String[] args) {

		int number =12345;
		int n =10;
		int evenCount=0;
		int oddCount=0;
		//Type 1  count the each digit from the given number
		/*
		while(number!=0) {
			int lastDigit = number%10;
			if(lastDigit%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			int newNumber =number/10;
			number=newNumber;
		}
		
	*/
		//Type 2 count the numbers untill the given number
			for(int i=1;i<=n;i++) {
				if(i%2==0) {
					evenCount++;
				}else {
					oddCount++;
				}
			}

		System.out.println("Even Numbers Count From The Input : "+evenCount);
		System.out.println("Odd Numbers Count From The Input : "+oddCount);
	}

}
