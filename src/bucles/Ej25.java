package bucles;
import java.util.*;
/*Pedir un número al usuario y controlar que sea positivo. Al final indicar cuántas cifras tiene.
 * 
 *  343 34 3 0
 *  
 *  cont 0 1 2 3 */
public class Ej25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, contCifras;
		
		System.out.print("Introduce un numero: ");
		numero = sc.nextInt();
		while(numero <= 0) {
			System.out.print("Error. Introduce otro numero: ");
			numero = sc.nextInt();
		}
		// Aquí llegas con un valor positivo
		
		// ALGORITMO PARA CONTAR LAS CIFRAS
		contCifras = 0;
		while(numero > 0) {
			numero = numero / 10;
			contCifras++;
		}
		System.out.println("El numero tiene " + contCifras + " cifras");
	}

}

/* Sumar las cifras del número 
 * Para sacar la última cifra % 10
 * El 29 y 30 de la hoja
 * 
 * */