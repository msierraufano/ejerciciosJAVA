package com;
import java.util.Scanner;

public class Actividad8 {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Dime un número y te diré su valor factorial");
	int num = sc.nextInt();
	int op =1;
	
	for(int i=num; i>0; i--)  {
		System.out.println(i);
		op *=i;
	}
	System.out.println("El resultado es " + op);
}
}
