package com;
import java.util.Scanner;

public class Actividad6 {
	
/*
 * Calcular nota media de dos notas enteras
 *
 */
public static void main(String[] args) {
	int nota1, nota2;
	double notaMedia;
	
	/*
	 * Leemos los valores
	 */

	Scanner sc= new Scanner (System.in);
	System.out.println("Dime la primera nota ");
	nota1 = sc.nextInt();
	System.out.println("Dime la segunda nota ");
	nota2 = sc.nextInt();
	
	/*
	 * Calculamos la nota media 
	 */
notaMedia = (nota1+nota2)/2.0;

System.out.println("Su nota media es " + notaMedia);


}

}
