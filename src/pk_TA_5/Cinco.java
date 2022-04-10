package pk_TA_5;

import java.util.Scanner;

public class Cinco {

	public static void main(String[] args) {
		
		// Convierte a binario el numero decimal introducido por teclado y lo muestra por pantalla
		
		int inputNumber = 0;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("---Convertir un numero decimal a binario---");
		System.out.println("Introduzca el numero:");
		inputNumber = scnr.nextInt();
		scnr.close();

		
		System.out.println(decimalToBinary(inputNumber));

	}

	/**
	 * Convierte numero decimal a binario
	 * 
	 * @param number
	 * @return String
	 */
	public static String decimalToBinary(int number) {

		int modified = number;
		String binaryString = "";

		while (modified > 0) {
			binaryString = (modified % 2) + binaryString;
			modified = modified / 2;
		}

		return binaryString;
	}
}
