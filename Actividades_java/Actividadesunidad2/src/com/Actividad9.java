package com;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, cifras;

		// preguntamos el número
		System.out.println("Dime un número entre 0 y 99.999");
		n1 = sc.nextInt();

		if (n1 <= 0 && n1 >= 99999) {
			System.out.println("El numero no está entre los valores pedidos");
		} else if (n1 <= 9) {
			cifras = 1;
			System.out.println("El numero" + "  " + n1 + "  " + "tiene" + cifras);
		} else if (n1 <= 99) {
			cifras = 2;
			System.out.println("El numero" + n1 + "tiene" + cifras);
		} else if (n1 <= 999) {
			cifras = 3;
			System.out.println("El numero" + n1 + "tiene" + cifras);

		} else if (n1 <= 9999) {
			cifras = 4;
			System.out.println("El numero" + n1 + "tiene" + cifras);
		} else if (n1 <= 99999) {
			cifras = 5;
			System.out.println("El numero" + n1 + "tiene" + cifras);
		}
	}
}
