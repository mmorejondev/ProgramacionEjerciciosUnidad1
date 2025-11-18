package main;
import java.util.Scanner;

public class Ejercicio614 {

	public static void main(String[] args) {
		/*Ejercicio 6.1.4: Crea un programa que pida al usuario un número 
		 * entero y muestre su cuadrado. Se repetirá mientras el 
		 * usuario introduzca un número distinto de cero.
		 */
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		numero=teclado.nextInt();
		
		while(numero!=0) {
			System.out.println("El cuadrado es: " + numero*numero);
			System.out.println("Introduzca un número: ");
			numero=teclado.nextInt();
		}
			
	}

}
