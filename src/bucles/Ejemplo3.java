package bucles;

import java.util.Scanner;

/*
 * 7. Mostrar todos los divisores de un número solicitado al usuario. 
 * 
 * Los divisores de 10 son: 1 2 5 10
*/
public class Ejemplo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("Introduce un numero:");
		numero = sc.nextInt();
		
		System.out.print("Los divisores de " +  numero + " son: ");
		for(int i = 1; i <= numero ;i++) {
			if(numero % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		
	}

}
