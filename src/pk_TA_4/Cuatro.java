package pk_TA_4;

import java.util.Scanner;

public class Cuatro {

	/*
	 * Muestra por pantalla el factorial del número introducido por teclado
	 */
	public static void main(String[] args) {
		
		long inputNumber = 0;
		
		System.out.println("Introduce un número para calcular su factorial:");
		Scanner scnr = new Scanner(System.in);
		inputNumber = scnr.nextInt();
		scnr.close();
		

		System.out.println("El factorial de " + inputNumber + " es: " + factorial(inputNumber));

	}

	/*
	 * Devuelve el factorial del numero recibido por parámetro
	 */
	public static long factorial(long number) {
		long total = 1;
		for (long i = number; i > 0; i--) {
			total = total * i;

		}
		return total;
	}

}
