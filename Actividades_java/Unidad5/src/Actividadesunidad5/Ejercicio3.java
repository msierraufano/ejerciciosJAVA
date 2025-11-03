package Actividadesunidad5;
import java.util.Scanner;

public class Ejercicio3 {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int numero1, numero2 = 0;
	
	//Introducir por teclado número 
	System.out.println("Dime un número");
	numero1= sc.nextInt();
	
	//Creamos la tabla de tamaño definido por usuario
	int [] tabla = new int[numero1];
	
	// Guardar los números introducidos por teclado en una tabla
	for(int i=0; i<tabla.length; i++) {
		System.out.println("Introduzca  número  " + (i+1) );
		numero2 = sc.nextInt();
		tabla[i] = numero2;
	}


}

public static int cuentaCero(int [] nums) {
	int contador = 0;
	for (int j=0; j<nums.length;contador++) {
		if (nums [j] == 0) {
			contador++;
		}
	}
	return contador;
	
}
}
