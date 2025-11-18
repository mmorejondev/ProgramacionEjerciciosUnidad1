package main.SolucionesExamenEnClase;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numeroActual=0;
		int cantidadPos=0, cantidadNeg=0, cantidadCeros=0;
		int max=0, min=0;
		double media=0.0;
		double sumaTotal=0.0;
		int sumaPos=0,sumaNeg=0;
		int posMax=0, posMin=0;
		int cantidadNumeros = 0;
		System.out.println("Introduzca la cantidad de números: ");
		cantidadNumeros = teclado.nextInt();

		if (cantidadNumeros>0) {
			
			
			for (int i=0;i<cantidadNumeros;i++) {
								
				System.out.println("n" + i + ":");
				numeroActual=teclado.nextInt();
				if (i==0) {
					max=numeroActual;
					min=numeroActual;
				}
								
				if (numeroActual>0) {
					cantidadPos++;
					sumaPos=sumaPos+numeroActual;
				}else if (numeroActual<0) {
					cantidadNeg++;
					sumaNeg = sumaNeg + numeroActual;
				}else if (numeroActual==0) {
					cantidadCeros++;
					
				}
				if (numeroActual>max) {
					max=numeroActual;
					posMax=i;
				}
				if (numeroActual<min) {
					min=numeroActual;
					posMin=i;
				}
				
				sumaTotal=sumaTotal+numeroActual;
			}
		
			media=sumaTotal/cantidadNumeros;
			System.out.println("Positivos: " + cantidadPos + ", Negativos: " + cantidadNeg + ", Ceros: " + cantidadCeros);
			
			System.out.println("Suma positivos: " + sumaPos + ", suma negativos: " + sumaNeg);
			System.out.println("Máximo: " + max + "( posición " + posMax + ")");
			System.out.println("Mínimo: " + min + "( posición " + posMin + ")");
			System.out.println("Media: " + media);
			
		}else {
			System.out.println("ERROR: PROGRAMA TERMINADO.");
		}
		
		
	}

}
