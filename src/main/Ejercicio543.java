package main;
import java.util.Scanner;

public class Ejercicio543 {

	public static void main(String[] args) {

		/*
		 * Ejercicio propuesto 5.4.3: Crea un programa que pida dos
		 * números reales al usuario y diga cuál es el mayor de ellos.
		 * */
		float numero1,numero2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número: ");
		numero1=teclado.nextFloat();
		
		System.out.println("Introduzca el segundo número: ");
		numero2=teclado.nextFloat();
		
		if(numero1>numero2) {
			System.out.println("El primero es mayor.");
		}else if(numero1<numero2) {
			System.out.println("El segundo es mayor.");

		}else {
			System.out.println("Son iguales.");

		}
		
		
		
	}

}
