package com;


public class Ejercicio11 {
public static void main(String [] args) throws Exception {
	System.out.println(elevado(121.0,3));
	
}
public static double elevado(double numero, int exponente) throws Exception  {
	if (numero < 0) {
		throw new Exception ("El número no puede ser negativo");
		}
	
	double resultado = 1;
	for (int i=1; i<=exponente; i++) {
		resultado = resultado * numero;
	}
	return resultado;
	
}
}
