package bucles;

import java.util.Scanner;

/*8. Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura medias, la cantidad de
	alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75. 
*/
public class Ejemplo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad, sumaEdades, contMayores18, contMayores175;
		float estatura, sumaAlturas;

		contMayores18 = 0;
		sumaEdades = 0;
		contMayores175 =0;
		sumaAlturas = 0.0f;
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("Introduce tu edad: ");
			edad = sc.nextInt();
			System.out.print("Introduce tu altura: ");
			estatura = sc.nextFloat();
			
			sumaEdades = sumaEdades + edad;
			
			sumaAlturas = sumaAlturas +  estatura;
			
			if(estatura > 1.75) {
				contMayores175++;
			}

			if (edad > 18) {
				contMayores18++;
			}

		}
		
		
		System.out.println("La edad media es " + (float)sumaEdades / 3);
		System.out.println("La cantidad de alumnos mayores de 18 es " + contMayores18);
		
		System.out.println("La altura media es " + (float)sumaAlturas / 3);
		System.out.println("La cantidad de alumnos mayores de 1.75 es " + contMayores175);
	}
}