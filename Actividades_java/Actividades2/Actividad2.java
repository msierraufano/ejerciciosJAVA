package com;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;

		System.out.println("Introduzca un numero:");
		numero1 = sc.nextInt();
		System.out.println("Introduzca otro numero");
		numero2 = sc.nextInt();
		if (numero1 == numero2) {
			System.out.println("Los numeros son iguales");

		} else {
			System.out.println("Los números son distintos");
		}

	}
}
