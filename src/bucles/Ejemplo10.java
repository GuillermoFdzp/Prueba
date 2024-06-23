package bucles;

import java.util.Scanner;

/*Pide un número y muestra la tabla de multiplicar de dicho número.
 * 
 *  Tabla de multiplicar del 7
 *  7 x 1 = 7
 *  7 x 2 = 14
 *  ...
 *  7 x 10 = 70
 *  */
public class Ejemplo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.print("Escribe un numero: ");
		numero = sc.nextInt();

		System.out.println("Tabla de multiplicar del " + numero);
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}

	}

}
