package pk_TA_6;

import java.util.Scanner;

public class Seis {

	/*
	 * Muestra por pantalla el total de cifras del numero introducido por teclado
	 */
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("--Muestra por pantalla el total de cifras del numero introducido--");
		System.out.println("Introduzca el número: ");
		int inputNumber = scnr.nextInt();
		scnr.close();

		System.out.println("El total de cifras es " + totalCifras(inputNumber));

	}

	public static int totalCifras(int number) {

		String numberString = String.valueOf(number);
		return numberString.length();

	}

}
