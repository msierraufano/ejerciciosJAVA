package com;

public class EjemploSobrecarga {

	public static void main(String[] args) {
		mostrar (11);
		mostrar(15);
	}
	// public static void mostrar(String nombre) {

	// System.out.println("Hola"+ nombre);
	// }
	//public static void mostrar(int numero) {
		//if (numero % 2 == 0) {
			
	//System.out.println("El número es par");
		//} else {
			//System.out.println("El número es impar");
		//}

	//}

	public static void mostrar(String mensaje, int veces) {
		while (veces > 0) {
			System.out.println(mensaje);
			veces--;
			
		}
	}
}