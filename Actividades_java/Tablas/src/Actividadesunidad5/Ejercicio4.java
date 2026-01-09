package Actividadesunidad5;
import java.util.Scanner;

/*
 * Implementar un programa que inicialice una tabla con tus números favoritos. 
 * Pedir al usuario el índice de un elemento que será eliminado. 
 * Continuar eliminando elementos hasta que el índice introducido sea negativo o no existan más elementos que borrar.
 * Validar siempre que el índice es válido.
 */
public class Ejercicio4 {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
		
	
	
	int pos;
	int[] numeros = {3,12,15,16,27,30,45,60,66,125};
	
	
	System.out.println(numeros.length);
	
	do {
	//Pedir al usuario el índice de un elemento
	System.out.println("Dime el índice: ");
	int num = sc.nextInt();
	if (num>= numeros.length || num <0)	{
		continue;
		
	}
		//Imprimir el último número de números
	 int aux = numeros.length - 1;
	System.out.println(numeros[aux]);
	
	
	;
	
	}while(numeros.length>0);
}

}
