package main;
import java.util.Scanner;

public class Ejercicio638 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el primer numero: ");
		long numero1=teclado.nextLong();
		System.out.println("Introduzca el segundo numero: ");
		long numero2=teclado.nextLong();
		
		
		int cantidadPrimos=0;

		/*Recorremos todos los numeros entre los dos introducidos*/
		for (long numero=numero1;numero<=numero2;numero++) {
			/*Para cada numero de ese rango, aplicamos la logica del 
			 * ejercicio anterior*/
			/*Iniciamos la comprobación de si un nuúmero es primo o no*/
			
			int contadorDivisores=0;
			for (int divisor=1;divisor<=numero;divisor++) {
				if (numero%divisor==0) {
					contadorDivisores++;
				}
			}
			/*Un numero es primo si y solo si la cantidad de divisores es 2*/
			if (contadorDivisores==2) {
				cantidadPrimos++;
			}
					
		}
		/*Al acabar el bucle mostramos cuantos primos hay entre un numero y otro*/
		System.out.println("Entre el " + numero1 + " y el " + numero2 + " hay " + cantidadPrimos + " primos.");
		
		
		
		
		
	}

}
