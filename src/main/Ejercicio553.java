package main;
import java.util.Scanner;

public class Ejercicio553 {

	public static void main(String[] args) {

		int numero1,numero2;
		Scanner teclado = new Scanner(System.in);

		/*Pedimos datos de entrada al usuario*/
		System.out.println("Introduzca primer número: ");
		numero1=teclado.nextInt();
		System.out.println("Introduzca segundo número: ");
		numero2=teclado.nextInt();
	
		//Comprobamos si los dos son pares
		if (numero1%2==0 && numero2%2==0) {
			System.out.println("Los dos son pares.");
		//Combrobamos si los dos son impares	
		}else if (numero1%2!=0 && numero2%2!=0) {
			System.out.println("Ninguno es par.");
		}else { //En otro caso uno de ellos debe ser par
			System.out.println("Uno de los números es par.");
		}
		
		/*Otra posible solución*/
		if (numero1%2==0 && numero2%2==0) {
			System.out.println("Los dos son pares.");
		}else if (numero1%2==0 || numero2%2==0) {
			System.out.println("Uno de ellos es par");
		}else { 
			System.out.println("Ninguno es par.");
		}
	
	
	
	}

}
