package main.EjerciciosRepaso;


import java.util.Scanner;

public class EjercicioRepaso5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		/*Vamos calculando la suma de los números introducidos
		 * hasta que el usuario introduzca un número negativo.
		 * El negativo no se suma.*/
		System.out.println("Introduzca el número: ");
		int numeroIntroducido=teclado.nextInt(); //El numero que introduce el usuario por primera vez
		int sumaNumeros=0;
		while(!(numeroIntroducido<0)) { //equivalente a numeroIntroducido>=0
			sumaNumeros = sumaNumeros + numeroIntroducido; //acumulador
			System.out.println("Introduzca el siguiente número: ");
			numeroIntroducido=teclado.nextInt(); //El numero que introduce el usuario por primera vez
			
		}
		System.out.println("La suma es: " + sumaNumeros);
		
	}

}
