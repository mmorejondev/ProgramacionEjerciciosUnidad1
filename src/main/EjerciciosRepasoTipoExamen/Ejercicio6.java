package main.EjerciciosRepasoTipoExamen;


import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		char viajeAAeropuerto; //guarda S o N
		
		float tarifaBajadaBandera=2.1f;
		float tarifaAeropuerto=4.0f;
		float tarifaBultoEspecial=1.5f;
		float tarifaNocturna=1.2f;
		float tarifaDiurna=0.95f;
		
		char bultoEspecial; // guarda S o N		
		float kilometros; 
		int franjaHoraria; //1 DIA 2 NOCHE
		
		float tarifaSinIva=2.1f; //PARTIMOS DEL VALOR DE BAJADA DE BANDERA
		float cantidadIVA; // LO CALCULAMOS AL FINAL

		float precioFinal; // LA SUMA DE TARIFA SIN IVA Y CANTIDADIVA
		
		System.out.println("Introduzca los kilómetros recorridos: ");
		kilometros=teclado.nextFloat();
		teclado.nextLine();
		
		System.out.println("Introduzca franja horaria (1)Día (2)Noche:");
		franjaHoraria=teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("¿Va al aeropuerto? [Sí(S)/No(N)]");
		viajeAAeropuerto=teclado.nextLine().charAt(0);
		
		System.out.println("¿Bulto especial? [Sí(S)/No(N)]");
		bultoEspecial=teclado.nextLine().charAt(0);
		
		/*Mostramos los datos introducidos a modo informativo*/
		System.out.println("Franja horaria: " + franjaHoraria);
		System.out.println("Kilómetros: " + kilometros);
		System.out.println("Aeropuerto: " + viajeAAeropuerto);
		System.out.println("Bulto Especial: " + bultoEspecial);
		
		if (franjaHoraria==1) {
			tarifaSinIva=tarifaSinIva + kilometros*tarifaDiurna;
		}else if (franjaHoraria==2) {
			tarifaSinIva=tarifaSinIva + kilometros*tarifaNocturna;
		}
		
		if (viajeAAeropuerto=='S') {
			tarifaSinIva=tarifaSinIva+tarifaAeropuerto;
		}
		if (bultoEspecial == 'S') {
			tarifaSinIva = tarifaSinIva + tarifaBultoEspecial;
		}
		//Añadimos el IVA
		cantidadIVA = tarifaSinIva*0.1f;
		precioFinal = tarifaSinIva + cantidadIVA;
		
		//Mostrar resultados
		System.out.println("------------RECIBO----------------");
		//Mostramos el 
		System.out.println("Bajada de bandera: " + tarifaBajadaBandera);
		
		if (franjaHoraria==1) {
			System.out.println("Km (" + kilometros + " x " + tarifaDiurna + "): " + kilometros*tarifaDiurna );
		}else if (franjaHoraria==2) {
			System.out.println("Km (" + kilometros + " x " + tarifaNocturna + "): " + kilometros*tarifaNocturna );
		}
		
		if (viajeAAeropuerto=='S') {
			System.out.println("Suplemento Aeropuerto: " + tarifaAeropuerto);
		}else {
			System.out.println("Suplemento Aeropuerto: " + 0.0f);
		}

		if (bultoEspecial == 'S') {
			System.out.println("Suplemento Bulto: " + tarifaBultoEspecial);
		}else {
			System.out.println("Suplemento Bulto: " + 0.0f);
		}
		System.out.println("Base Imponible: " + tarifaSinIva);
		System.out.println("IVA (10%): " + cantidadIVA);
		System.out.println("TOTAL: " + precioFinal);
		
		
	}

}
