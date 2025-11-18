package main.EjerciciosRepasoTipoExamen;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int cantidadManzanas=0,cantidadPlatanos=0,cantidadNaranjas=0;
		float precioManzana=1.5f;
		float precioPlatano=1.0f;
		float precioNaranja=0.8f;
		float totalAPagar = 0.0f;
		
		
		Scanner teclado = new Scanner(System.in);
		//Mostrar menú
		System.out.println("Seleccione producto: ");
		System.out.println("1.- Manzana - €1.5");
		System.out.println("2.- Plátano - €1.0");
		System.out.println("3.- Naranja - €0.8");
		System.out.println("4.- Terminar compra.");
		int opcionUsuario = teclado.nextInt();
				
		while(opcionUsuario!=4) {
			
			if (opcionUsuario==1) {
				cantidadManzanas++;
				System.out.println("Ha agregado una manzana.");
			}else if (opcionUsuario==2) {
				cantidadPlatanos++;
				System.out.println("Ha agregado un plátano.");

			}else if (opcionUsuario==3) {
				cantidadNaranjas++;
				System.out.println("Ha agregado una naranja.");

			}else {
				System.out.println("Producto incorrecto.");
			}
			
			System.out.println("Seleccione producto: ");
			System.out.println("1.- Manzana - €1.5");
			System.out.println("2.- Plátano - €1.0");
			System.out.println("3.- Naranja - €0.8");
			System.out.println("4.- Terminar compra.");
			opcionUsuario = teclado.nextInt();
				
		}
		
		teclado.nextLine(); //limpiamos el buffer de teclado
		
		System.out.println("Es cliente fidelizado (S/N)?: ");
		char fidelizado = teclado.nextLine().charAt(0);
				
		
		System.out.println("RESUMEN DE COMPRA");
		if (cantidadManzanas>0) {
			System.out.println(cantidadManzanas + " manzanas " + " x " + precioManzana + "€ = " + cantidadManzanas*precioManzana + "€");
			totalAPagar = totalAPagar + cantidadManzanas*precioManzana;
		} 
		if (cantidadPlatanos>0){
			System.out.println(cantidadPlatanos + " plátanos " + " x " + precioPlatano + "€ = " + cantidadPlatanos*precioPlatano + "€");
			totalAPagar = totalAPagar + cantidadPlatanos*precioPlatano;
		}
		if (cantidadNaranjas>0){
			System.out.println(cantidadNaranjas + " naranjas " + " x " + precioNaranja + "€ = " + cantidadNaranjas*precioNaranja + "€");
			totalAPagar = totalAPagar + cantidadPlatanos*precioPlatano;
		}
		
		if (fidelizado=='S' || fidelizado=='s') {
			totalAPagar = totalAPagar*0.95f;
			System.out.println("Descuento del 5% aplicado por ser cliente fidelizado.");
		}
		
		System.out.println("TOTAL A PAGAR: " + totalAPagar + "€.");		
		
		
	}

}
