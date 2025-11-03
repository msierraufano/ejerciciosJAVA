package com;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	
	int n;
	
	do {
		
		System.out.println("Dime un número <n>");
		n  =  sc.nextInt();
		
	} while (n<=1);
	
	
	System.out.println("Estos son los números del a al " + n);
	
	for (int i=1; i<=n; i++) {
		System.out.println(i);
	}
	}

}
