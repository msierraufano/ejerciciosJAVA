package com;
import java.util.Scanner;

public class Actividad6 {

	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);
	
		int n1, n2;
		
		System.out.println("Introduce un número");
		n1= sc.nextInt();
		
		System.out.println("Introduce otro número");
		n2= sc.nextInt();
		
	if (n1>n2) {
		//TRUE (VERDADERO)
		System.out.println(n1 + "es mayor que " + n2);
		
	}	else {
		//FALSE (FALSO)
		System.out.println(n2 +  "es mayor que " + n1);
	}
	}
	
}
