package pk_TA_3;

import java.util.Scanner;

public class Tres {

	/*
	 * Comprobar si el numero es primo
	 */
	public static void main(String[] args) {
		
		int numeroCheck = 0;
		
		// Input la cantidad total de numeros por input
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("¿Es número primo?");
		System.out.println("Introduce el numero:");
		numeroCheck = scnr.nextInt();
		scnr.close();
		
		if(isPrime(numeroCheck)) {
			System.out.println("El número es primo.");
		} else {
			System.out.println("El número no es primo");
		}

	}

	/*
	 * Prueba si el numero recibido es primo o no
	 * source: https://www.javatpoint.com
	 */
	public static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}

		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
