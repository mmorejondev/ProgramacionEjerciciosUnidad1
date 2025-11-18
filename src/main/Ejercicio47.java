package main;
import java.util.Scanner;

public class Ejercicio47 {

	public static void main(String[] args) {

		float base,altura,superficie;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la base del triángulo: ");
		base = teclado.nextFloat();
		System.out.println("Introduzca la altura del triángulo: ");
		altura = teclado.nextFloat();
		superficie=(base*altura)/2;
		System.out.println("La superficie es: " + superficie);
		
		
	}

}
