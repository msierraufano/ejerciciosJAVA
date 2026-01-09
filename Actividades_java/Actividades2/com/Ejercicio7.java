package com;

import java.util.Scanner;

/* Leer una serie de 6 enteros, guardarlos y mostrarlos ordenados.
Repetir con otra serie de 6. A continuación, fusionar ambas tablas 
en una tercera de forma que los 12 números sigan ordenados, sin volver
a ordenar.
*/
public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros1, numeros2 = 7;
		int[] tabla1 = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("Dime un número" + (i + 1));
			numeros1 = sc.nextInt();
			tabla1[i] = numeros1;

			
			}
		int[] tabla2 = new int[6];
		for (int j = 0; j < 6; j++) {
			System.out.println("Dime un número" + (j + 1));
			numeros2 = sc.nextInt();
			tabla2[j] = numeros2;

		}
	}
}
