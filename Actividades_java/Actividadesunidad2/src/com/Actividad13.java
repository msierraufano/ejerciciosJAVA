package com;

import java.util.Scanner;

public class Actividad13 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int segundo, minuto, hora;
		
		System.out.println("Dime la hora y te la adelantaré un segundo");
		System.out.println("¿segundo?");
		segundo = sc.nextInt();
		System.out.println("minutos");
		minuto = sc.nextInt();
		System.out.println("¿horas?");
		hora = sc.nextInt();
		
		if(hora >=24 || minuto >=60 || segundo >=60) {
			System.err.println("La hora no existe");
		}else {
			segundo++;
			if (segundo==60) {
				minuto++;
				segundo =0;
				
				if (minuto ==60) {
					hora++;
					segundo=0;
					minuto=0;
					
					if (hora == 24) {
						hora=0;
						minuto=0;
						segundo=0;
					}
				}
			}
			
			System.out.printf("La hora es: %02d:%02d:%02d", hora, minuto, segundo);
		}
	}

}
