package com;
import java.util.Scanner;

public class Actividad12 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int notaalumno;
	boolean suspenso =false;
	
	System.out.println("Dime las 5 notas");
	for(int i=1; i <= 5; i = i+1) {
		System.out.println("Dime una nota: ");
		notaalumno = sc.nextInt();
		System.out.println("Nota " + (i+1) + ".- " + notaalumno);
		if (notaalumno<5 ) {
		//	System.out.println("El alumno está suspenso");
			suspenso = true;
		}
		
	}
	if (suspenso) {
		System.out.println("Al menos un suspenso");
	}else {
		System.out.println("No hay suspensos");
	}
		
}
}
