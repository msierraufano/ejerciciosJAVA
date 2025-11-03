package com;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.useLocale(Locale.us);
		
		float numero1;

		System.out.println("Introduzca un numero decimal cercano a cero:");
		numero1 = sc.nextFloat();
		
		if (-1< numero1) {
			if (numero1<1 && numero1!=0) {
				System.out.println("El numero es casi cero ");

		} else {
			System.out.println("El numero no es casi cero");
		}
		}else {
			System.out.println("No es casi cero");
		}
	
	}

}
