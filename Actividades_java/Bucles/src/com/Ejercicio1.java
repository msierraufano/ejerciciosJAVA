package com;
import java.util.Scanner;

public class Ejercicio1 {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int numero=1,cuadrado= 0;
	
	
	
	while (numero!=0) {
	System.out.println("Dime un número");
	numero= sc.nextInt();
	
	if (numero % 2 ==0) {
		System.out.println("El número es positivo y par");
	}else {
		System.out.println("El número es positivo e impar");
	}
	if (numero<0) {
		System.out.println("El numero es negativo");
	}
	
	}
		
		
	}
	
	

	
		
			
	

}
