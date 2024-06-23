package bucles;

import java.util.Scanner;

/*Programa que va leyendo números desde teclado y calcula la suma de todos ellos. 
  * El programa finaliza cuando el número leído es 0. 
  */
public class Ej22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, suma;

		System.out.print("Introduce un numero: ");
		numero = sc.nextInt();
		suma = 0;
		while (numero != 0) {
			suma = suma + numero;
			System.out.print("Introduce un numero: ");
			numero = sc.nextInt();
		}

		System.out.println("El total de la suma total es: " + suma);
		System.out.println();

		/*
		 * numero 3 4 0 
		 * suma 0 4 4
		 * 
		 * numero 3 4 0
		 * suma 0 3 7 
		 * 
		 * 
		 */
	}

}
