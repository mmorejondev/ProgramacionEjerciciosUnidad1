package main;
import java.util.Scanner;

public class Ejercicio637 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número para saber si es primo: ");
		long numero=teclado.nextLong();
		int contadorDivisores=0;
		for (int divisor=1;divisor<=numero;divisor++) {
			if (numero%divisor==0) {
				contadorDivisores++;
			}
		}
		
		if (contadorDivisores==2) {
			System.out.println("Es primo.") ;
		}else {
			System.out.println("No es primo.");
		}
		
	}

}
