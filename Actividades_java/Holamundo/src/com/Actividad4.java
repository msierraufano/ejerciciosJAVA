package com;
import java.util.Scanner;
/**
 * Escribir una aplicación que pida el añó
 * actual y el de nacimiento del usuario
 * Debe calcular la edad suponiendo que el usuario en 
 * curso ya ha cumplido años
 * @param args
 */


public class Actividad4 {

public static void main(String[] args) { 
	Scanner scanner= new Scanner(System.in);
	System.out.println ("Introduzca su año de nacimiento: ");
	int anno = scanner.nextInt();
	System.out.println ("Introduzaca el año actual: ");
	int annoActual = scanner.nextInt();
	//calcular la edad
	int edadusuario = annoActual - anno;
	//mostrar la edad
	System.out.println("Usted tiene " + edadusuario + "años");
}

}
