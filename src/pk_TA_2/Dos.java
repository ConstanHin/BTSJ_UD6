package pk_TA_2;

import java.util.Scanner;

public class Dos {

	/*
	 *  Genera numeros enteros aleatorios y los muestra por pantalla
	 *  segun la cantidad y rango introducido
	 */
	public static void main(String[] args) {
		
		int min = 0;
		int max = 0;
		int totalNumeros = 0;

		
		// Input la cantidad total de numeros por input
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Cantidad de números a generar:");
		totalNumeros = scnr.nextInt();
		
		// Input rango de los numeros
		System.out.println("Numero minimo:");
		min= scnr.nextInt();
		System.out.println("Numero máximo:");
		max= scnr.nextInt();
		scnr.close();
		
		System.out.println("--Los numeros son:");
		
		int num[] = new int[totalNumeros];
		// Generar y mostrar por pantalla
		for (int i = 0; i < num.length; i++) {
			num[i] = generarNumeroAleatorio(min, max);
			System.out.println(num[i]);
		}

		
	}

	/*
	 * Genera un numero aleatorio entre un minimo y un maximo
	 */
	public static int generarNumeroAleatorio(int minimo, int maximo) {
		// https://stackoverflow.com/questions/2444019/how-do-i-generate-a-random-integer-between-min-and-max-in-java
		
		return (int) (Math.random() * (maximo +1 - minimo)) + minimo;
	}

}
