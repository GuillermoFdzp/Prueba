package bucles;
import java.util.*;


/*Leer dos números enteros y calcular su producto mediante sumas (sin usar el operador '*')
 * 
 * a * b = a + a + a + ... + a (b veces)
 * 3 * 4 = 3 + 3 + 3 + 3 = 12 
 * */
public class Ejemplo11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2,producto;
		
		System.out.print("Escribe el primer numero: ");
		numero1 = sc.nextInt();
		System.out.print("Escribe el segundo numero: ");
		numero2 = sc.nextInt();
		
		producto = 0;
		for(int i =1; i <= numero2 ; i++) {
			producto = producto + numero1 ;
		}
		/*i 1 2 3 4 5x
		 *producto 0 3 6 9 12
		 *numero1 3 
		 *numero2 4
		 * */
		
		System.out.println("Su producto es " + producto);
		
	}

}
