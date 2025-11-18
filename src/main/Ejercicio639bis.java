package main;
import java.util.Scanner;

public class Ejercicio639bis {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el lado: ");
		byte lado=teclado.nextByte();
		/*Declaramos las variables para que 
		 * sean visibles en todo el programa 
		 * (se entenderá más adelante cuando 
		 * expliquemos el ámbito de variables)*/
		int columna=0;
		int fila=0;
		for (fila=1;fila<=lado;fila++) {
			
			if (fila==1 || fila==lado) {
				for (columna=1;columna<=lado;columna++) {
					System.out.print("*");
				}
			}else{
				System.out.print("*");
				for (columna=2;columna<=lado-1;columna++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		
		}
	}

}
