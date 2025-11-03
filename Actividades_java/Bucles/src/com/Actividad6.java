package com;
import java.util.Scanner;
/*
 * Escribir todos los múltiplos de 7 menores que 100.
 */
public class Actividad6 {
	
	public static void main(String[]args) {
		for (int n=0; n<100; n++) {
			if (n%7 ==0) {
				System.out.println(n);
				System.out.println(" - ");	
				
			}
					
		/*
		 * Forma 2
		 * for (int n=0; n<100; n+=7) { 
		 * System.out.println(n);
		 * }
		 * 
		 * Forma 3; Falta el 0
		 * multiplo=7
		 * int n=0;
		 * int operación =0;
		 *
		 * while(operacion <=100) {
		 * n++;
		 * operacion= n* mult;
		 * If (operación < 100) {
		 * 
		 * }
		 * System.out.println(n);
		 * 
		 * Forma 4 
		 * int n =0;
		 * while (n<100) {
		 * System.out.println(n);
		 * n+=7
		 * 
		 * Forma 5
		 * int n=0;
		 * do {
		 * 
		 * 
		 * n = n+7; (n + =7;) Es lo mismo
		 * 
		 * } while( n<100 && n>=0);
		 * 
		 */
			
			
	}
}
}
