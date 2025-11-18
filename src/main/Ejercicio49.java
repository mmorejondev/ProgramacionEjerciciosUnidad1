package main;
import java.util.Scanner;

public class Ejercicio49 {

	public static void main(String[] args) {
		
		short anyoNacimiento,anyoActual,edad;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su año de nacimiento: ");
		anyoNacimiento = teclado.nextShort();
		
		System.out.println("Introduzca año actual: ");
		anyoActual = teclado.nextShort();
		
		edad =(short)(anyoActual-anyoNacimiento);
		System.out.println("Su edad es: " + edad);
		
		
		
		
	}

}
