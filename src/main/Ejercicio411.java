package main;
import java.util.Scanner;

public class Ejercicio411 {

	public static void main(String[] args) {

		float millas, kilometros;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca longitud en millas: ");
		millas = teclado.nextFloat();
		
		kilometros = millas*1.60934f;
		System.out.println(millas + " millas equivale a " + kilometros + " kilómetros");
		
		
	}

}
