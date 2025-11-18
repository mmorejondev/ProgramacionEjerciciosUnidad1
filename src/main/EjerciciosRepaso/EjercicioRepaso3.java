package main.EjerciciosRepaso;


import java.util.Scanner;

public class EjercicioRepaso3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el número: ");
		int numero = teclado.nextInt();
		
		int factorial = 1;//factorial = 1 x 2 x 3 x ... x numero
		for (int i=1;i<=numero;i++) {
			factorial=factorial*i;
		}
		System.out.println("El factorial es: " + factorial);
	
	}

}
