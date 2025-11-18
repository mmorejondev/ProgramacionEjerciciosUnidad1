package main;
import java.util.Scanner;

public class Ejercicio48 {

	public static void main(String[] args) {

		byte numero1,numero2;
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduzca el primer número: ");
		numero1=teclado.nextByte();
		System.out.println("Introduzca el segundo número: ");
		numero2=teclado.nextByte();
		byte suma;
		/*En Java, la suma de dos números devuelve como mínimo un int
		 * porque Java lo tienen así implementado. Si queremos guardar
		 * el resultado en un byte tendremos que hacer un casting explícito
		 * o casting estrecho*/
		suma= (byte)(numero1+numero2);
		System.out.println("La suma es: " + suma);
		
		
		
	}

}
