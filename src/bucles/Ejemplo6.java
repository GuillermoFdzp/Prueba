package bucles;

import java.util.Scanner;

/*
 * pedir 5 numeros al usuario contamos cuantos pares e impares hay
 * 
 * 2 3 4 3 5 
 * Has tecleado 2 pares y 3 impares
 * */
public class Ejemplo6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero, contadorPares, contadorImpares;
		
		contadorPares = 0;
		contadorImpares = 0;
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print("introduce un numero:");
			numero = sc.nextInt();
			
			if(numero % 2 ==0){
				contadorPares++;
			}else {
				contadorImpares++;
			}
			
		}
		System.out.println("Has tecleado " + contadorPares + " pares y " + contadorImpares + " impares");
		

	}

}
