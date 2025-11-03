package com;

public class Factorial {
	public static void main(String[] args) {
		int n = factorial(5);
		System.out.println(n);	
	}
	public static int factorial (int n) {
		if (n == 0)
			return 1;
		else 
			return n * factorial (n-1);
		
	}
	
}
