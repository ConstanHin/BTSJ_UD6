package pk_TA_1;

import java.util.Scanner;

public class Uno {

	public static void main(String[] args) {
		// Calcular area de circulo, cuadrado o triangulo

		// cuadrado 'un double
		// triangulo 'base por 'altura / 2, dos double
		// circulo pi * r^2

		Scanner scnr = new Scanner(System.in);

		String figura = "";

		System.out.println("Calcula el area de la figura geométrica.");
		System.out.print("Introduce el tipo de figura que quiere calcular (circulo/triangulo/cuarado):");
		figura = scnr.nextLine();
		figura = figura.toLowerCase();

		switch (figura) {
		case "circulo":
			areaCirculo();

			break;
		case "triangulo":
			areaTriangulo();

			break;
		case "cuadrado":
			areaCuadrado();

			break;
		default:
			System.out.println("Error al escoger figura geométrica");

			break;
		}

		scnr.close();
	}

	/*
	 * Calcula el area del circulo
	 */
	public static void areaCirculo() {

		double radius = 0;
		double result = 0;

		Scanner scnr = new Scanner(System.in);
		System.out.println("Ha escogido circulo");

		// Input
		System.out.print("Introduzca el radio del circulo: ");
		radius = scnr.nextDouble();

		// Calcular area

		result = Math.PI * Math.pow(radius, 2);

		// Output

		System.out.println("Area: " + result);

		scnr.close();
	}

	/*
	 * Calcula el area del triangulo
	 */
	public static void areaTriangulo() {

		double base = 0;
		double altura = 0;
		double result = 0;

		Scanner scnr = new Scanner(System.in);
		System.out.println("_____________________");
		System.out.println("Ha escogido triangulo");

		// Input
		System.out.println("");
		System.out.print("Introduzca el base del triangulo: ");
		base = scnr.nextDouble();
		System.out.println("");
		System.out.print("Introduzca el altura del triangulo: ");
		altura = scnr.nextDouble();

		// Calcular area
		result = (base * altura) / 2;

		// Output
		System.out.println("Area: " + result);

		scnr.close();
	}

	/*
	 * Calcula el area del triangulo
	 */
	public static void areaCuadrado() {

		double lado = 0;
		double result = 0;

		Scanner scnr = new Scanner(System.in);
		System.out.println("_____________________");
		System.out.println("Ha escogido cuadrado");

		// Input
		System.out.println("");
		System.out.print("Introduzca el lado del cuadrado: ");
		lado = scnr.nextDouble();

		// Calcular area
		result = lado * lado;

		// Output
		System.out.println("Area: " + result);

		scnr.close();
	}

}
