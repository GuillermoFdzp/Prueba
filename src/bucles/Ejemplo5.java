package bucles;

/* Pedir 5 números al usuario y calcular la suma de los pares por un lado y la 
 * de los impares por otro
 * 
 *  4 5 2 2 3 
 *  
 *  La suma de los pares es 8
 *  La suma de los impares es 8
 *  */
import java.util.*;

public class Ejemplo5 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, sumaPares, sumpaImpares;
		
		sumaPares = 0;
		sumpaImpares = 0;
		for(int i = 1; i < 5 ; i++){
			System.out.print("Escribe número: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				sumaPares = sumaPares + numero;
				
			}else {
				sumpaImpares = sumpaImpares + numero;
			}

		}
		
		System.out.println("La suma de los pares es " + sumaPares );
		System.out.println("La suma de los impares es " + sumpaImpares );

		
	}

}
