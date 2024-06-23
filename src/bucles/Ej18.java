package bucles;

import java.util.Scanner;

//Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar. 
public class Ej18{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;

	     while (numero==numero) {
	            System.out.print("Introduce un número: ");
	            numero = sc.nextInt();

	            if (numero % 2 == 0) {
	                System.out.println("El número " + numero + " es par");
	            } else {
	                System.out.println("El número " + numero + " es impar");
	            }
	            
	            if (numero == 0) {
	                break;
	            }
	        }

	        System.out.println("Adios");
	    }
}
