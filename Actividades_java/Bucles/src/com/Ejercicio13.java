package com;
import java.util.Scanner;

/*
 * Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */
public class Ejercicio13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//Definir variables.
	int alumNota, aprobado = 0, condicionado = 0, suspenso = 0;
	
	//Repetir 6 veces pedir nota alumnos
	for (int indice=0; indice<6; indice ++) {
		System.out.println("Dime las notas de 6 alumnos");
		alumNota = sc.nextInt();
		
		if (alumNota >=5) {
			aprobado++;
			
		}else if (alumNota == 4) {
			condicionado++;
			
		}else {
			suspenso++;
		}
	}
		System.out.println("Nº Aprobados " + aprobado);
		System.out.println("Nº Condicionados " + condicionado);
		System.out.println("Nº Suspensos " + suspenso);
}
}
