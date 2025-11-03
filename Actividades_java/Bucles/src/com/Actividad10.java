package com;
import java.util.Scanner;

public class Actividad10 {
	/**
	 * Se desea implementar una aplicación que pida al usuario que introduzca un número
	 * comprendido entre 1 y 10. Debemos mostrar la tabla de multiplicar de dicho número.
	 * El código tendrá que asegurarse de que el número introducido se encuentra entre el 1 y el 10.
	 * 
	 */
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	//Definir variables.
	int num, resultado;
	// Pedir número
	System.out.println("Introduce un número del 1 al 10");
	num = sc.nextInt();
	if (num<1 || num >10) {
		System.out.println("El número está fuera de rango ");
		
	} else {
	
		//Definir operaciones
		
		 for (int i=1; i<=10; i++) {
				resultado = (i * num); 
				 
			 System.out.println(resultado);
		
	}
		 
		 } 
			 
		 
	 
}
}
