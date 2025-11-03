package com;

public class Ejercicio12 {
public static void main(String []args) throws Exception {
	System.out.println(calculadora(12,0,4));
	
}
public static double calculadora(int a, int b, int operacion) throws Exception {
	float resultado = 0;
	switch (operacion) {
	case 1: 
		resultado = (a + b);
			break;
	case 2: 
		resultado = (a - b);
			break;
	case 3: 
		resultado = (a * b);
			break;
	case 4:
		if (b != 0) {
			resultado = (a / b);
			
		}else {
		throw new Exception ("No es posible realizar la operación solicitada");
		
		}
		
		break;

	default: 
		throw new Exception ("No es posible realizar la operación solicitada");
	
	}
	return resultado;
	
	
}

}
