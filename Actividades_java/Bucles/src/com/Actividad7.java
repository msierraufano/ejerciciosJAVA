package com;
 import java.util.Scanner;
 
public class Actividad7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Diseñar un programa que muestre el producto de los 10 primeros números impares.
		 */
		int num=1, producto = 1;
		//Mostrar los 10 primeros números impares.
		
		while (num <20) {
			producto *= num;
			//System.out.println(num);
			num += 2;
		}
			System.out.println("El producto :" + producto);
		
	}
}
