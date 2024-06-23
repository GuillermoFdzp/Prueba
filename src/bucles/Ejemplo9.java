package bucles;

import java.util.Scanner;

/*. Leer un número entero y calcular su factorial.
 * 
 * 4! = 1*2*3*4 = 4*3*2*
 * 
 * factorial = 1 1 2 3 12
 * i 1 2 3 4
 *    */
public class Ejemplo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero,factorial; 
		
		System.out.print("Escribe un número: ");
		numero=sc.nextInt();
		factorial = 1;
		for(int i = 1 ; i <= numero ;i++) {
			factorial = factorial * i;
			
		}
		System.out.println("El factorial es " + factorial );
		/* i 1 2 3 4 5 (no entra)
		 * factorial 1 1 2 6 24
		 * numero 4
		 * */
		
	}

}
