package main;
import java.util.Scanner;

public class Ejercicio639 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el lado: ");
		byte lado=teclado.nextByte();
		
		/*Para dibujar un cuadrado tenemos que repetir altura veces
		 * algunas intrucciones... Por lo tanto, podemos usar un for*/
		for (int fila=1;fila<=lado;fila++) {
			/*Ahora tenemos que repetir altura veces la instrucción
			 * de dibujar un asterisco...*/
			for (int columna=1;columna<=lado;columna++) {
				System.out.print(" * ");
			}
			System.out.println();
			
			
		}
		
		
		
		
	}

}
