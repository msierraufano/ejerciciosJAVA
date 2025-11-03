package com;

import java.util.Scanner;

public class Tabla_multiplicar {
	
	 public static void main(String[]args) {
		 Scanner sc= new Scanner(System.in);
		 int numero, resultado;
		 
		 System.out.println("Dime un número");
		 numero=sc.nextInt();
		 
		 for (int i=0; i<=10; i++) {
			resultado = (i * numero); 
			 
		 System.out.println(resultado);
		 
		 } 	
	 }
	 
	
}
