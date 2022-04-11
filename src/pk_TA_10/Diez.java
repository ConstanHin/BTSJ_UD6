package pk_TA_10;

import java.util.Scanner;

public class Diez {

	public static void main(String[] args) {

		System.out.println("--TA_10-Array números primos aleatorios--");
		// Indicar por teclado el tamaño del array
		Scanner scnr = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array:");
		int inputArraySize = scnr.nextInt();

		scnr.close();

		int numbers[] = new int[inputArraySize];

		rellenar(numbers, 0, 30);

		mostrarArray(numbers);

		mayorNumero(numbers);

	}

	/**
	 * Mostrar por pantalla los valores del array y la suma de los valores
	 * 
	 * @param array
	 */
	public static void mostrarArray(int[] array) {

		int sumaValores = 0;

		System.out.println("Los valores del array son: ");
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			// Print
			System.out.print(array[i]);
			if (i < array.length - 1)
				System.out.print(", ");
			// Sumar valores
			sumaValores = sumaValores + array[i];

		}
		System.out.println("}");

		// Mostrar suma valores
		System.out.println("----------------------------");
		System.out.println("La suma de los valores es: " + sumaValores);

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
	 * Genera un numero aleatorio primo entre un minimo y un maximo
	 * 
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public static int generarNumeroAleatorioPrimo(int minimo, int maximo) {
		int numPrimo = 0;

		while (!isPrime(numPrimo)) {
			numPrimo = generarNumeroAleatorio(minimo, maximo);
		}

		return numPrimo;

	}

	/**
	 * Rellenar las posiciones del array con numeros aleatorios
	 * 
	 * @return Integer
	 */
	public static void rellenar(int[] numArray, int min, int max) {

		for (int i = 0; i < numArray.length; i++) {
			int numeroAleatorio = generarNumeroAleatorioPrimo(min, max);

			numArray[i] = numeroAleatorio;
		}

	}

	/**
	 * Prueba si el numero recibido es primo o no
	 * 
	 * @param int number
	 * @return boolean
	 */
	public static boolean isPrime(int number) {
		// source: https://www.javatpoint.com

		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void mayorNumero(int[] numArray) {

		int mayor = 0;

		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] > mayor) {
				mayor = numArray[i];
			}
		}

		System.out.println("El mayor número del array es: " + mayor);

	}

}
