package pk_TA_7;

import java.util.Scanner;

public class Siete {

	public static void main(String[] args) {
		// Convierte de euros a otra moneda
		// Recibe por teclado una cantidad de euros y la moneda de cambio luego muestra la conversion por pantalla

		Scanner scnr = new Scanner(System.in);
		System.out.println("--Convierte cantidadEuross a dolares, yenes o libras--");
		System.out.println("Introduzca la cantidad de euros: ");
		double inputNumber = scnr.nextDouble();
		System.out.println("Introduzca la moneda de cambio (dolares/yenes/libras): ");
		String moneda = scnr.next();
		moneda = moneda.toLowerCase();
		scnr.close();

		euroCambio(inputNumber, moneda);

	}

	/**
	 * Muestra por pantalla el cambio de euros a otra moneda
	 * @param cantidadEuros
	 * @param moneda
	 */
	public static void euroCambio(double cantidadEuros, String moneda) {

		double totalCambio = 0;
		double valorDolares = 1.28611;
		double valorYenes = 129.854;
		double valorLibras = 0.86;

		switch (moneda) {
		case "dolares":
			totalCambio = cantidadEuros * valorDolares;
			break;
		case "yenes":
			totalCambio = cantidadEuros * valorYenes;

			break;
		case "libras":
			totalCambio = cantidadEuros * valorLibras;

			break;

		default:
			System.out.println("La moneda introducida no es válida!");
			return;
		}

		System.out.println(cantidadEuros + "€ son " + totalCambio + " " + moneda);

	}

}
