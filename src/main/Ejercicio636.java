package main;
import java.util.Scanner;

public class Ejercicio636 {

	public static void main(String[] args) {
		/*Ejercicio propuesto 6.3.6: Crea un programa que pida 
		 * al usuario un número entero largo y 
		 * muestre cuáles son sus divisores (aquellos entre los que 
		 * se puede dividir, obteniendo como resto 0).
		 */
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número para conocer sus divisores: ");
		long numero = teclado.nextLong();
		
		for (int posibleDivisor=1;posibleDivisor<=numero;posibleDivisor++) {
			if (numero%posibleDivisor==0) {
				System.out.print(posibleDivisor + " ");
			}
				
		}
		
		
	}

}
