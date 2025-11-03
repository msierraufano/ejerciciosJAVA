package com;
/*
 * Crear una función que, mediante un booleano, indique si el carácter pasado como parámetro corresponde a una vocal.
 */
public class Ejercicio6 {
public static void main(String[]args) {
char letravocal = 'a';
char letraConsonante = 'P';
	System.out.println(vocal('a'));
}
public static  boolean vocal(char caracter) {
	
	
	if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ) {
		return true;
	}
	return false;
}

}
