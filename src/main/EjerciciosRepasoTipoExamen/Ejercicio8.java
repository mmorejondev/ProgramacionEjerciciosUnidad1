package main.EjerciciosRepasoTipoExamen;


import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		/*
		 * Pedir el valor de 7 temperaturas
		 * 
		 * calcular la media --> calcular la suma
		 * 
		 * ir calculando el max y el min
		 * 
		 * */
		
		Scanner teclado = new Scanner (System.in);
		/*
		 * 
		 * SOLUCIÓN 1: CON UN BUCLE FOR
		 * 
		 * */
		
		/*Pedimos las 7 temperaturas que nos pide el problema*/
		int temperatura=0;
		/*Además, tendremos que ir acumulando la suma de todas
		 * las temperaturas para después calcular la media*/
		float sumaTemperaturas=0.0f;
		float mediaTemperaturas=0.0f;
		/*Tenemos que ir guardando cual es la máxima y la mínima en cada
		 * iteración del bucle*/
		
		int temperaturaMaxima=0,temperaturaMinima=0;
		
		for (int dia=1;dia<=7;dia++) {
			System.out.println("Introduzca la temperatura del día " + dia + " :");
			temperatura=teclado.nextInt();
			
			/*En la primera iteración del bucle podemos dar un valor
			 * inicial tanto a minima como a maxima, por ejemplo, 
			 * la primera temperatura introducida*/
			if (dia==1) {
				temperaturaMinima=temperatura;
				temperaturaMaxima=temperatura;
			}
			
			/*Con los siguientes condicionales actualizamos las
			 * temperaturas maxima y minima*/
			if (temperatura>temperaturaMaxima) {
				temperaturaMaxima=temperatura;
			}
			if (temperatura<temperaturaMinima) {
				temperaturaMinima=temperatura;
			}
						
			sumaTemperaturas = sumaTemperaturas + temperatura;
		}
		
		/*Calculamos y mostramos la temperatura media*/
		mediaTemperaturas=sumaTemperaturas/7;
		
		System.out.println("La temperatura media de la semana: " + mediaTemperaturas);
		System.out.println("La temperatura máxima de la semana: " + temperaturaMaxima);
		System.out.println("La temperatura mínima de la semana: " + temperaturaMinima);

		
		System.out.println("______________Versión con bucle while____________");
		/*
		 * 
		 * SOLUCIÓN 2: CON UN BUCLE WHILE
		 * 
		 * */	
		sumaTemperaturas=0.0f;
		int day=1;
		while (day<=7) {
			
			System.out.println("Introduzca la temperatura del día " + day + " :");
			temperatura=teclado.nextInt();
			
			/*En la primera iteración del bucle podemos dar un valor
			 * inicial tanto a minima como a maxima, por ejemplo, 
			 * la primera temperatura introducida*/
			if (day==1) {
				temperaturaMinima=temperatura;
				temperaturaMaxima=temperatura;
			}
			/*Con los siguientes condicionales actualizamos las
			 * temperaturas maxima y minima*/
			if (temperatura>temperaturaMaxima) {
				temperaturaMaxima=temperatura;
			}
			if (temperatura<temperaturaMinima) {
				temperaturaMinima=temperatura;
			}
						
			sumaTemperaturas = sumaTemperaturas + temperatura;
			
			day++;
			
		}
		
		/*Calculamos y mostramos la temperatura media*/
		mediaTemperaturas=sumaTemperaturas/7;
		
		System.out.println("La temperatura media de la semana: " + mediaTemperaturas);
		System.out.println("La temperatura máxima de la semana: " + temperaturaMaxima);
		System.out.println("La temperatura mínima de la semana: " + temperaturaMinima);

		
		
		
		
		
		
	}

}
