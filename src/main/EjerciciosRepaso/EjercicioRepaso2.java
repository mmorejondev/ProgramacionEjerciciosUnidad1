package main.EjerciciosRepaso;


import java.util.Scanner;

public class EjercicioRepaso2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el primer número: ");
		int inferior = teclado.nextInt();
		System.out.println("Introduzca el segundo número: ");
		int superior = teclado.nextInt();
		int ContadorPares=0;
		
		for (int i=inferior;i<=superior;i++) {
			if (i%2==0) {
				ContadorPares++;
			} //si es par
				//incrementar ContadorPares 
		}
		System.out.println("Hay " + ContadorPares + " números pares.");
		
	}

}
