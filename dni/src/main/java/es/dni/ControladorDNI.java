package es.dni;

import java.util.Random;

public class ControladorDNI {
	private final char [] LETRAS ={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	private final int DIVISOR = 23;
	private final int LONGITUD_NUMERO_DNI = 8;
	private final int LONGITUD_DNI_COMPLETO = 9;
	
	
	private char calcularLetra(String numeroDNI) {
	 if (numeroDNI == null) {
		 throw new IllegalArgumentException("El numero introducido no puede ser nulo");
	 }
	 if(numeroDNI.length() !=LONGITUD_NUMERO_DNI) {
		 throw new IllegalArgumentException("El numero introducido no tiene la longitud correcta");
	 }
	 return 0;
	}
	public String generarAleatorioDNI() {
	Random random = new Random ();
	int numeroDNIRandom =random.nextInt(100_000_000);
	String numero = String.format("%08d, numeroDNIRandom");
	System.out.println(numero);
		return "TODO";
	}
		
	
}

