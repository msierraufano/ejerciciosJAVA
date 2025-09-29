package com;
import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		int nota1, nota2, nota3;
		int notamedia;
		double notadecimal;
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Dime la primera nota ");
		nota1 = sc.nextInt();
		System.out.println("Dime la segunda nota ");
		nota2 = sc.nextInt();
		System.out.println("Dime la tercera nota ");
		nota3  = sc.nextInt();
		
		notamedia=(nota1 + nota2 + nota3)/3;
		notadecimal=(nota1+nota2+nota3)/3.0;
		
		System.out.println("Su nota media es" + notamedia);
		System.out.println("Su nota media es" + notadecimal);
		
	}
}
	

