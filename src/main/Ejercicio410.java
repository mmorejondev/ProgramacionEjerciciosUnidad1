package main;
import java.util.Scanner;

public class Ejercicio410 {

	public static void main(String[] args) {

		double numero1,numero2;
		float division;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca numero 1: ");
		numero1 = teclado.nextDouble();
		
		System.out.println("Introduzca numero2: ");
		numero2 = teclado.nextDouble();
		
		division=(float)(numero1/numero2);
		
		System.out.println("La división es: " + division);
		
		
		
		
	}

}
