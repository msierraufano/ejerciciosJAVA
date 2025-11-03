package Actividadesunidad5;
import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n1;
	
	System.out.println("Dime un número ");
	n1 = sc.nextInt();
	

			
	int [] numeros = new int [n1];
	//for ( int i=n1; i>0; i--) {
	for (int i=0; i<numeros.length; i++)	{ 
		System.out.println("Introduzca el número");
		numeros [i] = sc.nextInt();
	}
	//Mostrar los valores en orden inverso
	for ( int i=n1-1; i>=0; i--) {
		System.out.println(numeros[i]);
}
}
}