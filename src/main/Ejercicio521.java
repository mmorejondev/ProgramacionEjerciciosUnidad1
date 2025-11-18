package main;
import java.util.Scanner;

public class Ejercicio521 {

	public static void main(String args []) {
	
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduzca un numero: ");
		numero=teclado.nextInt();
		
		if (numero>0) {
			System.out.println("El número es positivo.");
		}else {
			System.out.println("El número es cero o no es positivo.");
		}
		
		
		
	}
}
