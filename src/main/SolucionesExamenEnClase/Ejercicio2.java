package main.SolucionesExamenEnClase;


import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		System.out.println(" 1) Ingresar  2) Retirar  3) Saldo  4) Salir");
		int opcion = teclado.nextInt();
		double cantidadAIngresar=0,cantidadARetirar=0,saldo=0;
		int ingresos=0,retiradas=0;
		double totalIngresos=0,totalRetiradas=0;
		while(opcion!=4) {
			
			
			if (opcion==1) {
				System.out.println("Indique la cantidad a ingresar: ");
				cantidadAIngresar=teclado.nextDouble();
				if (cantidadAIngresar>0) {
					saldo=saldo+cantidadAIngresar;
					ingresos++;
					totalIngresos=totalIngresos + cantidadAIngresar;
					System.out.println("Ha ingresado " + cantidadAIngresar + "€");

				}else {
					System.out.println("Cantidad Errónea. Ha de ser positivo.");
				}
					
			}else if(opcion==2){
				System.out.println("Indique la cantidad a retirar: ");
				cantidadARetirar=teclado.nextDouble();
				if (cantidadARetirar<saldo) {
					if (cantidadARetirar>0) {
						saldo=saldo-cantidadARetirar;
						retiradas++;
						totalRetiradas=totalRetiradas + cantidadARetirar;
						System.out.println("Ha retirado " + cantidadARetirar + "€");


					}else {
						System.out.println("Cantidad Errónea. Ha de ser positivo.");
					}
					
				}else {
					System.out.println("Saldo insuficiente.");
				}
				
			}else if (opcion==3) {
				
				System.out.println("Su saldo es: "  + saldo);
								
			}else {
				System.out.println("Opción incorrecta.");
			}
			
			
			System.out.println(" 1) Ingresar  2) Retirar  3) Saldo  4) Salir");
			opcion = teclado.nextInt();
			
		}//fin del while

		System.out.println("----------RESUMEN-----------");
		System.out.println("Saldo final: " + saldo);
		System.out.println("Cantidad ingresos: " + ingresos + "("+ totalIngresos+ "€)");
		System.out.println("Cantidad retiradas: " + retiradas + "("+ totalRetiradas+ "€)");
		

		
	}

}
