package com.demo.javaprograms;

public class Array_05_Minimum_Maximum_Number {
	int a[] = {10, 20, 6, 40, 50, 5 ,70, 60};
	int min =a[0]; int max=a[0];
	
	public void minimum() {
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]<min) {
				//10<10 False, 20<10 False, 6<10 True min =a[i];
				//40<6 False, 50<6 False, 5<6 True min =a[i];
				//70<5 False, 60 <5 False
				min =a[i];
				
			}
			//System.out.println(min);
		}
		System.out.println("Minmum Number in the array: "+min);
	}
	
	public void maximum() {
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]>max) {
				// 10>10 False, 20>10 True max =a[i], 6>20 False, 40>20 True max =a[i]
				// 50>40 True max =a[i], 5>50 False, 70>50 True max =a[i], 60>70 Flase
				max =a[i];
			}
			//System.out.println(max);
		}
		System.out.println("Minmum Number in the array: "+max);
	}

	public static void main(String[] args) {
		// Find Minimum and Maximum Number
		Array_05_Minimum_Maximum_Number minmax =new Array_05_Minimum_Maximum_Number();
		minmax.minimum();
		minmax.maximum();
	}

}
