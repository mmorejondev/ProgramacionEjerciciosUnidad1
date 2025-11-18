package main;
import java.util.Scanner;

public class Ejercicio544 {

	public static void main(String[] args) {

		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el número: ");
		numero=teclado.nextInt();
		
		
		if (numero%3==0) {
			System.out.println("El " + numero + " es múltiplo de 3.");
		}else {
			System.out.println("El " + numero + " no es múltiplo de 3.");
		}
		
		
		
	}

}
