package com;
import java.util.Scanner;

public class Actividad14 {
	public static void main(String[] args) {
		double numerodecimal;
		int numeroRe;
		
		Scanner sc= new Scanner (System.in);
		
		//solicitamos al usuario un numero
		System.out.println("Dime un numero decimal ");
		numerodecimal = sc.nextDouble();
		
		numeroRe = Math.round(numerodecimal);
		
		System.out.println("El numero entero más próximo es" + numeroRe);
		
		
	}	
		
}
