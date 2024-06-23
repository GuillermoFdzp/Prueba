package bucles;

import java.util.Iterator;
import java.util.Scanner;

/*Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido. */
public class Ejemplo13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, contador;
		
		System.out.print("Introduce un numero: ");
		numero=sc.nextInt();
		
		contador = 0;
		while(numero >=0 ) {
			System.out.print("Introduce otro numero: ");
			numero = sc.nextInt();
			contador++;
		}
		
		System.out.print("Has introducido " + contador + " numeros");
	}

}
