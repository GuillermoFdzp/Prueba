package bucles;
import java.util.*;
/*Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
 * 
 *  Introduce un número: 3
 *  3 al cuadrado es 9
 *  Introduce otro número: 0
 *  0 al cuadrado es 0
 *  Introduce otro número: -1
 *  Adiós*/

public class Ejemplo12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("Escribe un numero: ");
		numero = sc.nextInt();
		while(numero >= 0) {
			System.out.println(numero + " al cuadrado es " + (numero*numero));
			System.out.print("Escribe otro numero: ");
			numero = sc.nextInt();
		}
		System.out.println("Adiós");
		
		/*
		 * numero 3 1 0 -6
		 * 
		 * 3 al cuadrado es 9
		 * 1 al cuadrado es 1
		 * 0 al cuadrado es 0
		 * */

		
	}

}
