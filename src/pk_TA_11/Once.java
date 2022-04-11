package pk_TA_11;

import java.util.Scanner;

public class Once {

	/*
	 * TA6-11
	 * Crear un array a partir de otros dos
	 */
	public static void main(String[] args) {
		

		System.out.println("--TA6-11--");
		// Indicar por teclado el tamaño del array
		Scanner scnr = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array:");
		int inputArraySize = scnr.nextInt();

		scnr.close();
		int[] primerArray = new int[inputArraySize];
		int[] segundoArray = new int[inputArraySize];

		// Rellenar primer array con numeros aleatorios
		rellenar(primerArray, 1, 5);
		// Apuntar al segundo array
		segundoArray = primerArray;
		// Reasignar con valores aleatorios
		rellenar(segundoArray, 5, 10);
		
		int[] tercerArray = multiplicarPosiciones(primerArray, segundoArray);
		
		System.out.println("");
		System.out.println("Primer array:");
		mostrarArray(primerArray);
		System.out.println("");
		System.out.println("Segundo array:");
		mostrarArray(segundoArray);
		System.out.println("");
		System.out.println("Tercer array:");
		mostrarArray(tercerArray);

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
	
	public static int[] multiplicarPosiciones(int[] primerArray, int[] segundoArray) {
		int[] tercerArray = new int[primerArray.length];
		
		for (int i = 0; i < tercerArray.length; i++) {
			tercerArray[i] = primerArray[i] * segundoArray[i];
		}
		
		return tercerArray;
	}

}
