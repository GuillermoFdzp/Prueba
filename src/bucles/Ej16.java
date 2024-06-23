package bucles;

import java.util.Scanner;
/*Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo. */

public class Ej16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("Escribe un numero: ");
		numero=sc.nextInt();
		
		while(numero >= 0) {
			System.out.println("El cuadrado de " +  numero + " es: "+numero*numero);
			System.out.print("Escribe otro numero: ");
			numero=sc.nextInt();
			
			
		}
		System.out.println("No se adminten numeros negativos");
	}

}
