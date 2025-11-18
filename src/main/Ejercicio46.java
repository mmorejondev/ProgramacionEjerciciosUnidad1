package main;
import java.util.Scanner;

public class Ejercicio46 {

	public static void main(String[] args) {
		
		float tempCelsius, tempFarenheit;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca la temperatura en Celsius: ");
		tempCelsius=teclado.nextFloat();
		tempFarenheit = (((tempCelsius *  9)/ 5)  + 32);
		System.out.println("La temperatura en Farenheit es: " + tempFarenheit);


	}

}
