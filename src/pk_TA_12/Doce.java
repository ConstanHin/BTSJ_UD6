package pk_TA_12;

import java.util.Scanner;

public class Doce {

	/*
	 * TA6-12
	 * 
	 */
	public static void main(String[] args) {
		int digit = 0;
		System.out.println("--TA6-12--");
		// Indicar por teclado el tamaño del array
		Scanner scnr = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array:");
		int inputArraySize = scnr.nextInt();

		int[] numberArray = new int[inputArraySize];

		rellenar(numberArray, 1, 300);

		mostrarArray(numberArray);

		// Pedir digito con el que acaba
		do {
			System.out.println("");
			System.out.println("Introduce el ultimo digito del entero(del 0 al 9):");
			digit = scnr.nextInt();
		} while (!isDigit(digit));
		scnr.close();

		// Mostrar los number que acaban con el digito introducido
		int[] arrayLastDigit = mostrarNumeros(digit, numberArray);

		System.out.println("");
		System.out.println("Array con numeros acabadon en '" + digit + "' :");
		mostrarArray(arrayLastDigit);

	}

	/**
	 * Muestra los numeros del array que acaben con el digito recibido y los
	 * devuelve un nuevo array con los numeros
	 * 
	 * @param digit
	 * @param array
	 */
	private static int[] mostrarNumeros(int digit, int[] array) {
		boolean anyNumber = false;
		int flag = 0;

		// Comprobar y mostrar los digitos
		System.out.println("Los numeros del array con el último digito '" + digit + "' son:");
		for (int i = 0; i < array.length; i++) {
			if (digit == array[i] % 10) {
				System.out.println(array[i]);
				flag++;
			}
		}

		// Mostrar si no hay numeros y devolver array vacio
		if (flag < 1) {
			System.out.println("No hay números que correspondan");
			System.out.println("");
			return new int[0];
		}

		// Crear array
		int[] arrayLastDigit = new int[flag];
		flag = 0;

		// Rellenar con los valores
		for (int i = 0; i < array.length; i++) {
			if (digit == array[i] % 10) {

				arrayLastDigit[flag] = array[i];
				flag++;
			}
		}

		return arrayLastDigit;

	}

	/**
	 * Comprobar si es un solo digito
	 * 
	 * @param digit
	 * @return
	 */
	private static boolean isDigit(int digit) {
		if (digit >= 0 && digit <= 9)
			return true;
		return false;
	}

	/**
	 * Rellenar las posiciones del array con numeros aleatorios
	 * 
	 * @return Integer
	 */
	public static void rellenar(int[] numArray, int min, int max) {

		for (int i = 0; i < numArray.length; i++) {
			int numeroAleatorio = generarNumeroAleatorio(min, max);

			numArray[i] = numeroAleatorio;
		}

	}

	/**
	 * Genera un numero aleatorio entre un minimo y un maximo
	 * 
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public static int generarNumeroAleatorio(int minimo, int maximo) {
		// https://stackoverflow.com/questions/2444019/how-do-i-generate-a-random-integer-between-min-and-max-in-java

		return (int) (Math.random() * (maximo + 1 - minimo)) + minimo;
	}

	/**
	 * Mostrar por pantalla los valores del array
	 * 
	 * @param array
	 */
	public static void mostrarArray(int[] array) {

		System.out.println("Los valores del array son: ");
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			// Print
			System.out.print(array[i]);
			if (i < array.length - 1)
				System.out.print(", ");

		}
		System.out.println("}");

	}

}
