package com;

public class Ejercicio14 {
public static void main(String [] args) {
	System.out.println(fibonaci(9));
}
public static int fibonaci(int num) {
	int resultado;
	if (num == 0)  {
		return 1;
	}else if (num == 1) {
		return 1;
		
	}else  {
		resultado = fibonaci(num-1) + fibonaci(num - 2);
	}
	return resultado;
	
} {

	
}
}
