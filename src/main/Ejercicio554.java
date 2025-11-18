package main;
import java.util.Scanner;

public class Ejercicio554 {

	public static void main(String[] args) {

		/*Ejercicio propuesto 5.5.4: Crea un programa que pida tres números 
		 * enteros largos al usuario y diga cuál es el mayor de los tres.
		 */
		
		long numero1,numero2,numero3;
		
		Scanner teclado = new Scanner(System.in);

		/*Pedimos datos de entrada al usuario*/
		System.out.println("Introduzca primer número: ");
		numero1=teclado.nextLong();
		System.out.println("Introduzca segundo número: ");
		numero2=teclado.nextLong();
		System.out.println("Introduzca tercer número: ");
		numero3=teclado.nextLong();
		
		if (numero1==numero2 && numero2==numero3) {
			System.out.println("Los tres son iguales.");
		}else {
					
		
			if (numero1>=numero2 && numero1>=numero3) {
				System.out.println("El primer número es el mayor.");
			}else if (numero2>=numero1 && numero2>=numero3) {
				System.out.println("El segundo número es el mayor.");
			}else if (numero3>=numero1 && numero3>=numero2) {
				System.out.println("El tercer número es el mayor.");

			}
			
		}
		
		System.out.println("PROGRAMA TERMINADO.");
		
		/*
		 * Dejamos pendiente una solución en la que nos diga cual es 
		 * estrictamente el mayor
		 * */
		
	}

}
