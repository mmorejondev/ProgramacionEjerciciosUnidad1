package main;
import java.util.Scanner;

public class Ejercicio616 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int usuario, password;
	
		System.out.println("Introduzca su usuario: ");
		usuario=teclado.nextInt();
		
		System.out.println("Introduzca su contraseña: ");
		password=teclado.nextInt();
		
		while(!(usuario==1807 && password==1234)) {
			
			System.out.println("Login incorrecto.");
			
			System.out.println("Introduzca su usuario: ");
			usuario=teclado.nextInt();
			
			System.out.println("Introduzca su contraseña: ");
			password=teclado.nextInt();
			
		}
		
		
		System.out.println("Login correcto.");
		
	}

}
