package com;
import java.util.Scanner;
import java.util.Random;

public class Actividad3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	//Inicializar numero secreto aleatorio
	int numerosecreto=random.nextInt(100) + 1;
	//Variable para que el usuario agregue el número
	int intento=0;
	
	System.out.println("Adivine el número entre 1 y 100: \n prueba");
	System.out.println("Introduce -1 para salir");
	
	while (true) {
		System.out.println("Escribe un numero");
		intento = sc.nextInt();
		
		if (intento == -1) {
			System.out.println("Te has rendido");
			break;
		}
		if (intento == numerosecreto) {
			
		}
	}
}
}
