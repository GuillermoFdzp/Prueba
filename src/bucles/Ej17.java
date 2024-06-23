package bucles;

import java.util.Scanner;
/*Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se
introduzca un 0. 
*/
public class Ej17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.print("introduce un numero ");
		numero = sc.nextInt();

		do {

			System.out.print("introduce un numero ");
			numero = sc.nextInt();

			if (numero < 0) {
				System.out.println("el numero es negativo");
			} else if (numero > 0) {
				System.out.println("El numero es positivo");
			}
		} while (numero != 0);

		System.out.println("Has introducido un 0");
	}

}
