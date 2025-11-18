package main.EjerciciosRepasoTipoExamen;


import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/* Pedimos un numero que tiene que ser mayor que 0
		 * 
		 * mientras que el numero no sea 1 repetimos la secuencia de instrucciones
		 * 
		 * si es par
		 * 	dividimos por 2 e imprimimos
		 * si es impar
		 * 	multiplicamos por 3 sumamos 1 e imprimimos
		 * 
		 * Otras cosas que nos piden...
		 * */
		Scanner teclado = new Scanner(System.in);
		int numero=0;
		int longitud=1;
		int max=0;
		int contadorPares=0,contadorImpares=1;//inicializamos impares a 1 porque segun el enunciado terminar en 1 lo cuenta como paso
		float media=0.0f;
		float sumaNumeros=1.0f;
		
		
		
		//Pedimos el numero por teclado
		System.out.println("Introduzca el número: ");
		numero = teclado.nextInt();
		// Validamos la entrada: Nos aseguramos de que sea mayor que 0
		while (numero<=0) {
			System.out.println("Error: El número tiene que ser mayor que 0.");
			System.out.println("Introduzca el número: ");
			numero = teclado.nextInt();
		}
		//Cuando introducimos un numero válido, lo podemos añadir ya a la suma
		System.out.println();
		System.out.print("Secuencia de Collatz: " + numero);
		//En principio podemos inicializar el maximo como el propio numero
		max=numero;
		
		while (numero!=1) {
			//vamos acumulando la suma de los numeros
			sumaNumeros = sumaNumeros + numero; 
			if (numero%2==0) {//es par
				numero=numero/2;
				contadorPares++;//vamos contando los pares
			}else if(numero%2!=0){//es impar
				numero = numero*3 + 1;
				contadorImpares++;//vamos contando los impares
			}
			if (numero>max) {
				max=numero;
			}
				
			longitud++;
			System.out.print(" " + numero);
		}
		
		media = sumaNumeros/longitud;
		
		System.out.println();
		System.out.println("Longitud: " + longitud);
		System.out.println("Pasos pares: " + contadorPares);
		System.out.println("Pasos impares: " + contadorImpares);
		System.out.println("Media aritmética: " + media);
		System.out.println("Máximo: " + max);

		
		
		
		
		
		
		
		
		
		
		
	}

}
