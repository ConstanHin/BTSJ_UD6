package pk_TA_8;

import java.util.Scanner;

public class Ocho {

	public static void main(String[] args) {
		
		// Introducir y mostrar los valores del array

		int numbers[] = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rellenar(i);
		}

		mostrar(numbers);

	}

	/**
	 * Rellenar las posiciones del array con los valores introducidos por teclado
	 * @param posicion
	 * @return int
	 */
	public static int rellenar(int posicion) {

		System.out.println("Introduce el número de la posición " + posicion);
		Scanner scnr = new Scanner(System.in);
		return scnr.nextInt();

	}


	/**
	 * Mostrar por pantalla los valores del array
	 * @param array
	 */
	public static void mostrar(int[] array) {
		System.out.println("Los valores del array son: ");
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i< array.length-1) System.out.print(", ");
		}
		System.out.println("}");
	}

}
