package Actividadesunidad5;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
	
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	// Guardar en una tabla 5 números dados por el usuario.
	int programador, puntuacion;
	
	int [] puntos = new int [5];
	for (int i=0; i<puntos.length; i++) {
	System.out.println("Dime tu puntuación: ");
	puntos[i] = sc.nextInt();
	
		
    
	}
	System.out.println(Arrays.toString(puntos));
	Arrays.sort(puntos);
	System.out.println(Arrays.toString(puntos));
	//
}
}
