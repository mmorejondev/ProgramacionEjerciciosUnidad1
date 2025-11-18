package main;
import java.util.Scanner;

public class Ejercicio6310 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el alto: ");
		byte alto=teclado.nextByte();
		System.out.println("Introduzca el ancho: ");
		byte ancho=teclado.nextByte();
		/*Declaramos las variables para que 
		 * sean visibles en todo el programa 
		 * (se entenderá más adelante cuando 
		 * expliquemos el ámbito de variables)*/
		int columna=0;
		int fila=0;
		for (fila=1;fila<=alto;fila++) {
			
			if (fila==1 || fila==alto) {
				for (columna=1;columna<=ancho;columna++) {
					System.out.print("*");
				}
			}else{
				System.out.print("*");
				for (columna=2;columna<=ancho-1;columna++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		
		}
	}
}


