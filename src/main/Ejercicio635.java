package main;
import java.util.Scanner;

public class Ejercicio635 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el límite superior: ");
		int limite = teclado.nextInt();
		
		for (int i=1;i<=limite;i++) {
			if (i%3==0 && i%7==0) {
				System.out.println(i + " ");
			}
			//Otra forma de hacerlo
			/*if (i%3==0) {
				if (i%7==0) {
					System.out.println(i + " ");
			
				}
			}*/
		}
	teclado.close();
	}

}
