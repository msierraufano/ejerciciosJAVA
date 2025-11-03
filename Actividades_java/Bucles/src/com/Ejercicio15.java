package com;
import java.util.Scanner;

public class Ejercicio15 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/*
	 * Realizar un programa que nos pida un número n, y nos diga cuántos números hay
	 * entre 2 y n que sean primos. Un número primo es aquél que solo es divisible por 1
	 *  y por él mismo. Veamos un ejemplo para n = 8:
	 */
	
	/*int num1 = 2, num2;
	System.out.println("Dime un número");
	num2 = sc.nextInt();
	
	for (num2>num1; ((num2%num2 == 1) && (num2%1 == num2)); num2  "Primo") {
		
	}
	
}
}
*/
}
	public static boolean esPrimo(int n) {
	boolean dev = true;
	
	for(int i=2; i< n-1; i++) {
		if (n % i == 0) {
			return false;
		}
	}
	return dev;
}


}
