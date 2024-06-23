package bucles;

import java.util.Iterator;
import java.util.Scanner;

public class Ej19 {
	/*
	 * Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se
	 * han introducido
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, contadorNumeros;
		contadorNumeros=0;

		while (true) {
			System.out.print("Ingrese un numero: ");
			numero = sc.nextInt();
			if(numero < 0) {
				break;
			}
			
			contadorNumeros++;
		}
		System.out.println("Has introducido un total de " + contadorNumeros + " numeros");
		System.out.print("Adios");

	}

}
