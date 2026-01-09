package es.calculadora;

public class Calculadora {
	
private int num1;
private int num2;

	public Calculadora(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int sumar() {
		int resultadoSuma = num1 + num2;
		return resultadoSuma;
	}

	public int restar() {
		int resultadoResta = num1 - num2;
		return resultadoResta;
	}

	public int multiplicar() {
		int resultadoMultiplicacion = num1 * num2;
		return resultadoMultiplicacion;

	}

	public double division() {
		double resultadoDivision = 0;

		if (num2 == 0) {
			throw new ArithmeticException("No se puede dividir un número por cero");

		} else {
			resultadoDivision = num1 / num2;
		}

		return resultadoDivision;

	}

}
