package com;
import java.util.Scanner;

public class Ejercicio14 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime un número");
	int numero = sc.nextInt();
	
	for (int i=1; numero<i; i++) {
		System.out.print("*");
		int e = 0;
		
		while (e < i) {
			System.out.print("*");
			e++;
		}
	}
	System.out.println(" ");
}
}
