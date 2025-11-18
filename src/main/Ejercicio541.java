package main;
import java.util.Scanner;

public class Ejercicio541 {

	public static void main(String[] args) {
		/*
		 * Ejercicio propuesto 5.4.1: 
		 * Crea un programa que pida al usuario que introduzca el número 12. 
		 * Después debe decirle si lo ha hecho correctamente o no.
		 */
	
		int numeroTecleado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el número 12: ");
		numeroTecleado=teclado.nextInt();
		
		if (numeroTecleado==12) {
			System.out.println("Es correcto. Ha teclado el 12.");
		}else {
			System.out.println("Incorrecto, no ha teclado el 12.");
		}
		
		
		
		
		
		
	
	
	}

}
