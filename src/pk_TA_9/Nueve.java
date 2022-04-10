package pk_TA_9;

import java.util.Scanner;

public class Nueve {

	/*
	 * Crea un array con el numero de posiciones introducidas por el teclado las
	 * rellena con valores aleatorios, calcula el total de los valores y los muestra
	 * por pantalla.
	 */
	public static void main(String[] args) {

		// Indicar por teclado el tamaño del array
		Scanner scnr = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array:");
		int inputArraySize = scnr.nextInt();
		scnr.close();

		int numbers[] = new int[inputArraySize];

		// Rellenar el array con numeros aleatorios entre 0 y 9
		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = rellenar(0, 9);
		}

		mostrarArray(numbers);

	}

	/**
	 * Rellenar las posiciones del array con numeros aleatorios
	 * 
	 * @return Integer
	 */
	public static int rellenar(int min, int max) {

		int numeroAleatorio = generarNumeroAleatorio(min, max);

		return numeroAleatorio;

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

}
