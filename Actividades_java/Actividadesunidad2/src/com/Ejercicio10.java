package com;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String Capicua = " es capicúa";
		final String negacion = " no es capicúa";
		int numero, unidades, decenas, centenas, millares;

		System.out.println("Introduce un número de 2 a 4 cifras");
		numero = sc.nextInt();

		if (numero < 10) {
			System.out.println("El número " + negacion + "  por ser de una cifra");

		} else if (/* (numero >= 10) && */(numero < 100)) {
			unidades = numero % 10;
			decenas = numero / 10;

			if (unidades == decenas) {
				System.out.println("El número" + Capicua);
			} else {
				System.out.println("El número" + negacion);

			}

		} else if ((/* numero >= 100) && ( */numero < 1000)) {
			unidades = numero % 10;
			centenas = numero / 100;

			if (unidades == centenas) {
				System.out.println("El número " + Capicua);
			} else {
				System.out.println("El número" + negacion);

			}
		} else if ((/* numero >= 1000) && ( */numero < 10000)) {
			unidades = numero % 10;
			decenas = (numero / 10) % 10;
			centenas = (numero / 100) % 10;
			millares = numero / 1000;

			if ((unidades == millares) && (decenas == centenas)) {
				System.out.println("El número " + Capicua);
			} else {
				System.out.println("El número" + negacion);
			}
		}

	}
}
