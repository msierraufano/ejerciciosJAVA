package Actividadesunidad5;
import java.util.Scanner;

public class Ejercicio1 {
 public static void main(String[]args) {
	 Scanner sc = new Scanner(System.in);
	 double num1;
	 
	 //Defino tabla
	 double [] numeros = new double [5];
	 for(int i=0; i<numeros.length;i++ ) {
		 
		 //Pido los números
		System.out.println(i+"Dime un número:");
		num1 = sc.nextDouble();

		numeros[i] = num1;
		
	 }
	 //Los muestro en el orden en el que fueron introducidos
	 for (double num:numeros) {
		 System.out.println(num);
	 }
 }
 }

