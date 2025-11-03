package com;

public class Ejercicio5 {
public static void main(String []args) {
	System.out.println(mayor(8, 5, 6)) ;
}
	public static int mayor (int n1, int n2, int n3) {
	if (n1>=n2 && n1>=n3) {
	return n1;
	}else if (n2>=n1 && n2>=n3) {
	return n2;	
	}else {
	return n3;
	}
}
}
