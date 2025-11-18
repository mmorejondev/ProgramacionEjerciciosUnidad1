package main;
import java.util.Scanner;

public class Ejercicio542 {

	public static void main(String[] args) {
		/*
		 * Ejercicio propuesto 5.4.2: Crea un programa que pida un número entero 
		 * al usuario y diga si es positivo (mayor que cero), 
		 * si es negativo (menor que cero) o si, por el contrario, 
		 * es exactamente 0 (necesitarás usar la estructura if - else if - else).
		 * */
		int numeroTecleado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el número: ");
		numeroTecleado=teclado.nextInt();
		
		if (numeroTecleado>0) {
			System.out.println("Es positivo.");
		}else if (numeroTecleado<0) {
			System.out.println("Es negativo.");
		}else{
			System.out.println("Es cero.");
		}
		
		
		
		
		
		
	}

}
