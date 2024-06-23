package bucles;

import java.util.Scanner;
/*Comprobar si un número es primo. */
public class Ej30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero ;
		boolean esPrimo = true;

		System.out.print ("Introduce un numero");
		numero = sc.nextInt();

		if (numero <= 1) {
			esPrimo = false;
		} else {
			for (int i = 2; i <= numero / 2; i++) {
				if (numero % i == 0) {
					esPrimo = false; //
				}
			}
		}

		if (esPrimo) {
			System.out.println(numero + " es un número primo.");
		} else {
			System.out.println(numero + " no es un número primo.");
		}
	}
}
