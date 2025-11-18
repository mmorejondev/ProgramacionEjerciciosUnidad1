package main;
import java.util.Scanner;

public class Ejercicio552 {

	public static void main(String[] args) {
		/*Declaración de variables*/
		int numero1,numero2;
		Scanner teclado = new Scanner(System.in);

		/*Pedimos datos de entrada al usuario*/
		System.out.println("Introduzca primer número: ");
		numero1=teclado.nextInt();
		System.out.println("Introduzca segundo número: ");
		numero2=teclado.nextInt();
		
		/*Comprobamos si el numero1 es positivo Y el numero2 también es positivo*/
		if (numero1>0 || numero2>0) {
			System.out.println("Algunos de los dos es positivo.");
		}else {
			System.out.println("Ambos son no positivos.");
		}
		
	}

}
