package main;
import java.util.Scanner;

public class Ejercicio617 {

	public static void main(String[] args) {

		/*Ejercicio 6.1.7: Crea un programa que escriba en pantalla 
		 * tantos asteriscos como el usuario indique, todos ellos en 
		 * la misma línea.
		 */
		
		Scanner teclado = new Scanner(System.in);
		int numero;
	
		System.out.println("Introduzca un número: ");
		numero=teclado.nextInt();
	
		while (numero>0) {
			System.out.print("*");
			numero--;//numero=numero-1;
		}
		
		System.out.println();

	}

}
