package com;
import java.util.Scanner;

public class Actividad8 {

	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		
		//Defino las variables
		double coefA, coefB, coefC, resultado_x1, resultado_x2, delta, delta_raiz;

		//pedir los coeficientes
		System.out.println("Dame el valor de a");
		coefA=sc.nextDouble();
		coefB=sc.nextDouble();
		coefC=sc.nextDouble();
		
		//calcular dentro de la raiz
		delta=(coefb * coefB) - 4 * coefA * coefC;
		delta_raiz = Math.sqrt(delta);
		
		if(coefA == 0) {
			if (coefB !=0) {
				resultado_x1 = -coefC / coefB;
				System.out.println("Esto es una ecuación de primer grado");
				System.out.println("x vale" + resultado_x1);
			
			} else {
				//coefA --> 0 ; coefB -->0;
				System.out.println("0!=" + coefC + ", es inconsistente");
			}
		}else {
			// coefA !=0
			if (delta >0) {
				delta_raiz = Math.sqrt(delta);
				//solucion_1
				resultado_x1 = ((-1 * coefB)+ delta_raiz / 2 * coefA);
				//solucion_2
				resultado_x2 = ((-1 . coefB) - delta_raiz / (2 * coefA));
				
				System.out.println("Hay dos resultados");
				System.out.println("resultado x1") + resultado_x1;
				System.out.println("resultado x2") + resultado_x2;
				
				
				else if (delta ==0) {
			} 
			
		}
		
	
	
	
	}
}
