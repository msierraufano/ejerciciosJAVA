package com;
import java.util.Scanner;

/*
 * Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
 * A continuación solicitará por teclado un número que debe estar dentro del rango.
 * Si el valor introducido no pertenence al rango, la aplicación volverá a pedir otro valor,
 * y así repetidas veces, hasta que el valor se encuentre dentro del rango.
 */
public class Ejercicio5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int max, min, num;
	
	System.out.println("Dime el valor máximo del rango");
		max = sc.nextInt();
		
	System.out.println("Dime el valor mínimo del rango");
		min=sc.nextInt();
		
	System.out.println("Dime un numero");
	 num = sc.nextInt();
	 
	 
	
	while (num>max || num<min) {
			
			
		System.out.println("El número está fuera de rango");	
		break;
			
		}if (num<max || num>min) {
			System.out.println(num + "  está dentro del rango mínimo:" + min + " y máximo:"+  max );
		}
	
}
}
