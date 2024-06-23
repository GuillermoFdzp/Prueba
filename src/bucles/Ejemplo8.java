package bucles;

import java.util.Scanner;

/* Programa que lee 100 números y cuenta cuantos han sido pares, cuantos impares y cuantos nulos */
public class Ejemplo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int contPares, contImpares, contNulos;

		contPares = 0;
		contImpares = 0;
		contNulos = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Escribe un número: ");
			numero = sc.nextInt();

			if (numero % 2 == 0 && numero !=0) { // es par y distinto de cero (para no contar los ceros como pares)
				contPares++;
			} else if (numero % 2 == 1) { // es impar
				contImpares++;
			}
			else { // si no es nada de lo anterior --> es cero
				contNulos++;
			}

		}
		System.out.println("Has escrito " + contPares + " pares");
		System.out.println("Has escrito " + contImpares + " impares");
		System.out.println("Has escrito " + contNulos + " nulos");
	}

}
