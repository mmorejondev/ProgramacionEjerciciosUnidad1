package main;
import java.util.Scanner;

public class Ejercicio615 {

	public static void main(String[] args) {
		/*Ejercicio 6.1.5: Crea un programa que pida al usuario 
		 * su contraseña (un número entero). Se repetirá mientras 
		 * introduzca una contraseña distinta de "1234".
		 */
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su contraseña: ");
		int password=teclado.nextInt();
		
		while(password!=1234) {
			
			System.out.println("Contraseña incorrecta.");
			System.out.println("Introduzca su contraseña: ");
			password=teclado.nextInt();
		}
		
		
		System.out.println("Login correcto.");
		
	}

}
