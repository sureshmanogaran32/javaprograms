package com.demo.javaprograms;

public class Program003_ReverseString {
	public static void main(String[] args) {
		String s = "ABCD";
		System.out.println("Before Reverse String: "+s);
		System.out.println("Length of String: "+s.length());
		String rev="";
		//Approach 1 by using charAt()
	/*	for(int i=s.length()-1; i>=0;i--) {
			rev=rev+s.charAt(i);
			System.out.println("Reverse String: "+rev);
		}  
	*/
		//Approach 2 by using string builder
	/*
		StringBuilder sb =new StringBuilder(s);
		rev = sb.reverse().toString();
		System.out.println("Reverse String: "+rev);
	*/
		//Approach 1 by using toCharArray()
		char[] charArray = s.toCharArray();
		for(char c:charArray) {
			rev=c+rev;
			System.out.println("Reverse String: "+rev);
		}
	}
}
