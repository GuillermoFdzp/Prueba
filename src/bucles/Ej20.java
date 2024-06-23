package bucles;

import java.util.Scanner;

/*Realizar un juego para adivinar un número. Para ello pedir un número, y luego ir pidiendo
números indicando “mayor” o “menor” según sea mayor o menor con respecto a ese número. El
proceso termina cuando el usuario acierta. */
public class Ej20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, numeroSecreto;

		
		numeroSecreto = (int)(Math.random() * 100 + 1);
		
		System.out.print("Introduce un numero: ");
		numero = sc.nextInt();
		while (numero != numeroSecreto) { // mientras no aciertes el número
			if(numero < numeroSecreto) {
				System.out.println("Te has quedado corto");
				
			}else{
				System.out.println("Te has pasado");
			}
			System.out.print("Introduce un numero: ");
			numero = sc.nextInt();
			
		}
		System.out.println("Has acertado el numero ");

	}

}
