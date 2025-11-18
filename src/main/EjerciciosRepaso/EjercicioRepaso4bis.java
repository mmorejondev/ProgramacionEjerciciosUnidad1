package main.EjerciciosRepaso;


import java.util.Random;
import java.util.Scanner;

public class EjercicioRepaso4bis {

	public static void main(String[] args) {

		Random generaAleatorios = new Random();
		/* Genera un número aleatorio del 1 al 100 y lo guarda en la variable numeroAleatorio*/
		int numeroAleatorio = generaAleatorios.nextInt(101); 
		int intento=0;
		Scanner teclado = new Scanner(System.in);
		int contadorIntentos=0;
		int maximoIntentos = 4;
		
		System.out.println("Introduzca su intento: ");
		intento=teclado.nextInt();
		contadorIntentos=1; //Acabamos de usar un intento
		
		while(!(intento==numeroAleatorio) && (contadorIntentos<maximoIntentos)) { //(intento!=numeroAleatorio)
			
			if (intento>numeroAleatorio) {
				System.out.println("El numero a adivinar es menor");
			}else {
				System.out.println("El numero a adivinar es mayor");
			}
			System.out.println("Introduzca su intento: ");
			intento=teclado.nextInt();
			contadorIntentos++;
			
		}
		
		if (intento==numeroAleatorio && contadorIntentos<=maximoIntentos) {
			System.out.println("Has acertado!!");
			System.out.println("Has necesitado " + contadorIntentos);
		}else {
			System.out.println("Has superado el número de intentos.");
		}
		
		
		
		

	}

}
