package main.EjerciciosRepasoTipoExamen;


import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		float totalAPagar = 0.0f;
		float precioCafe=2.5f;
		float precioTe = 2.0f;
		int contadorCafe=0;
		int contadorTe=0;
		int totalProductos=0;
		
		
		System.out.println("Seleccione opción: ");
		System.out.println("1.- Café (2.5€)");
		System.out.println("2.- Té   (2€)");
		System.out.println("3.- Terminar pedido.");
		opcion = teclado.nextInt();
		
		while(opcion!=3) {
			
			/* Hacemos cosas (calcular lo que tiene que pagar el usuario segun
			   lo que ha elegido)*/
			if (opcion==1) {
				totalAPagar = totalAPagar + precioCafe;
				contadorCafe++;
				totalProductos++;

				
			}else if (opcion == 2) {
				totalAPagar = totalAPagar + precioTe;
				contadorTe++;
				totalProductos++;

			}else {
				System.out.println("Ha introducido una opción incorrecta.");
			}
			
			
			System.out.println("Seleccione opción: ");
			System.out.println("1.- Café (2.5€)");
			System.out.println("2.- Té   (2€)");
			System.out.println("3.- Terminar pedido.");
			opcion = teclado.nextInt();
					
		}//Fin del while, para salir, el usuario debe haber pulsado 3
		
		//Mostramos lo que tiene que pagar el usuario
		System.out.println("Detalle de compra");
		System.out.println("- " + contadorCafe + " café/s = " + contadorCafe*precioCafe + " €");
		System.out.println("- " + contadorTe + " té/s = " + contadorTe*precioTe + " €");
		System.out.println("_________________________________________");
		System.out.println("Total a pagar: " + totalAPagar + "€");
		
		
		
	}

}
