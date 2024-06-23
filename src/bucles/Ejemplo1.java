package bucles;

import java.util.Iterator;

/* Números entre 1 y 10: 1 2 3 4 5 6 7 8 9 10
 * Números pares entre 1 y 10: 2 4 6 8 10
 * Números pares entre 1 y 10: 2 34 6 8 10
 * Números impares entre 1 y 10: 1 3 5 7 9
 * Números impares entre 1 y 10: 1 3 5 7 9
 * */
public class Ejemplo1 {
	public static void main(String[] args) {
		
		System.out.print("Números entre 1 y 10: ");
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("Números pares entre 1 y 10: ");
		for(int i = 1 ; i <= 10 ;i++) {
			if( i % 2==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.print("Números pares entre 1 y 10: ");
		for(int i = 2 ; i <=10 ; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("Números impares entre 1 y 10: ");
		for(int i = 1 ; i<=10 ; i++) {
			if(i % 2 ==1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		System.out.print("Números impares entre 1 y 10: ");

		for(int i = 1 ; i < 10 ; i+=2) {
			System.out.print(i + " ");
		}
	
		
	}
}

/* TRAZA
 * i 1 2 3 4 5 6 (no entra)
 * 1 2 3 4 5 
 * */

/*
 * i: variable de control
 * i = 1 --> inicialización (1ª vez)
 * i <= 5 --> 10(mientras se cumpla la condición sigue entrando)
 * i++ (i = i + 1) --> avance (2ª vez en adelante)
 * 
 * */
