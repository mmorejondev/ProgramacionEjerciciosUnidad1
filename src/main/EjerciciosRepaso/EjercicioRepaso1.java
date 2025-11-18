package main.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioRepaso1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el número: ");
		int tabla = teclado.nextInt();
		
		for (int i=0;i<=10;i++) {
			int resultado = tabla*i;
			System.out.println(tabla + " x " + i + " = " + resultado);
		}
		/*int i=0;
		while(i<=10) {
			System.out.println(tabla + " x " + i + " = " + tabla*i);
			i++;
		}*/
			
		
	}

}
