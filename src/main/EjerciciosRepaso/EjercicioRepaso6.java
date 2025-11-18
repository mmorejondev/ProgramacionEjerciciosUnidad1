package main.EjerciciosRepaso;


import java.util.Scanner;

public class EjercicioRepaso6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el número: ");
		int numeroIntroducido=teclado.nextInt();
		System.out.println("Introduzca el otro número: ");
		int numeroIntroducido2=teclado.nextInt();
	
		
		for (int tabla=numeroIntroducido;tabla<=numeroIntroducido2;tabla++) {
			for (int i=0;i<=10;i++) {
				System.out.println(tabla + " x " + i + " = "+ tabla*i);
			}
			System.out.println();
		}
	
	
	}

}
