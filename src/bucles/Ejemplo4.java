package bucles;

/*
 * Pedir 5 números al usuario y calcular su suma.
 *  4 5 2 2 3 
 *  
 *  La suma es 16
 * */
import java.util.*;

public class Ejemplo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, suma;

		suma = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce número: ");
			numero = sc.nextInt();
			suma = suma + numero;
		}
		System.out.print("La suma es " + suma);
		
		/*
		 * i 0 
		 * numero 6
		 * suma 12
		 * */


	}

}

/*
 * i 0 1 2 3 4 5 (no entra) 
 * numero 3 5 -1 2 2 
 * sumador 0 3 8 7 9 11
 */
