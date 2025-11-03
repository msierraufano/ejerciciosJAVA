package com;
import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int edad, alumn, mediaedad, mayoredad, sumaedad;
		// Contador de alumnos
		alumn = 0;
		//Contador alumnos mayores de edad
		mediaedad=0; 
		mayoredad=0; 
		sumaedad =0;
		
		do {
			System.out.println("Que edad tiene el alumno");
			edad= sc.nextInt();
			if (edad>=0) {
				alumn++;
				sumaedad= sumaedad + edad;
				//sumaedad + = edad;
				
				mediaedad=sumaedad/alumn;
			}
			if (edad > 18) {
				mayoredad++;
			}
		}while (edad >=0);
		System.out.println("La suma de las edades es " + sumaedad);
		System.out.println("La media de edades es" + mediaedad);
		System.out.println("Los alumnos mayores de edad son " + mayoredad);
		System.out.println("El numero de alumnos es " + alumn);
	}
}
