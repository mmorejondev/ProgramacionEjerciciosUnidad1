package main;

public class Ejercicio612 {

	public static void main(String[] args) {
		/* Ejercicio 6.1.2: Crea un programa que muestre los números 
		 * pares del 20 al 2, decreciendo, usando "while"
		 */
		
		int numero=20;
		
		while (numero>=2) {
			System.out.print(numero + " ");
			numero=numero-2; //equivalente a numero-=2
			
		}
		
		
	}

}
