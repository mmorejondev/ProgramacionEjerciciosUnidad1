package main;

public class Ejercicio633 {

	public static void main(String[] args) {
		/*Ejercicio propuesto 6.3.3: Crea un programa 
		 * que muestre la "tabla de multiplicar del 7", 
		 * usando "for"*/
	
		for (int i=0;i<=10;i++) {
			System.out.println("7 x " + i + " = " + 7*i);
		}
		/*Otra posible solución*/
		int contador=0;
		for (int j=7;j<=70;j+=7) {
			System.out.println("7 x " +  contador + " = " + j);
			contador++;
		}
		
	}

}
