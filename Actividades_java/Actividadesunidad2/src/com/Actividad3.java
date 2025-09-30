package com;
import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;

		System.out.println("Introduzca un numero:");
		numero1 = sc.nextInt();
		System.out.println("Introduzca otro numero");
		numero2 = sc.nextInt();
		if (numero1 > numero2) {
			System.out.println("El numero mayor es "+ numero1);

		} else {
			System.out.println("El numero mayor es " + numero2);
		}

	}
}

