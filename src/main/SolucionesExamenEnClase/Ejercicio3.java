package main.SolucionesExamenEnClase;


import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int minutos;
		int tipoDia;
		char ticketPerdido;
		
		System.out.println("Minutos estacionado: ");
		minutos=teclado.nextInt();
		System.out.println("Tipo de dia (1.Laboral 2.Fin de semana o Festivo): ");
		tipoDia=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ticket perdido?");
		ticketPerdido=teclado.nextLine().charAt(0);
		float tarifa = 0.0f;
		int mediasHoras=0;
		int mediasHorasExtra=0;
		int mediasHorasBarata=0;
		float recargoTicketPerdido=0.0f;
		float recargoFinDeSemana=0.0f;
		float iva=0.0f,total=0.0f;
		float baseImponible=0.0f;
		
		if (minutos > 30) {
				
			//calculamos tramos de medias horas
			 mediasHoras = minutos / 30;
			 if (minutos % 30 != 0) {
				 mediasHoras++;  // Añadir una fracción extra si sobran minutos
			 }
			 
			 if (mediasHoras<=4) {
				 mediasHorasBarata=mediasHoras;
				 tarifa = tarifa + mediasHorasBarata*1.2f;
			 }else {
				 mediasHorasBarata=4;
				 mediasHorasExtra = mediasHoras-4;
				 
				 tarifa = tarifa + mediasHorasBarata*1.2f;
				 tarifa = tarifa + mediasHorasExtra*1.0f;
			 }
			 baseImponible=tarifa;

			 if (tipoDia==2) {
				 recargoFinDeSemana=tarifa*0.1f;
				 tarifa=tarifa + recargoFinDeSemana;
			 }

		}
		
		if (ticketPerdido=='S') {
			recargoTicketPerdido=20.0f;
			tarifa=tarifa+recargoTicketPerdido;
		}
		
		iva = tarifa*0.21f;
		total = tarifa + iva;
		
		/*--- RECIBO --
Minutos: 135
 Tramo hasta 2h: 4 medias horas x 1,20 € = 4,80 €
 Tramo adicional: 1 medias horas x 1,00 € = 1,00 €
 Base imponible: 5,80 €
 Recargo fin de semana (10%): 0,58 €
 Recargo pérdida: 0,00 €
 IVA (21%): 1,34 €
 TOTAL: 7,72 €
		 * */		
		
		System.out.println("---- RECIBO -----");
		System.out.println("Minutos: " + minutos);
		System.out.println("Tramos hasta 2h: " + mediasHorasBarata + " x 1,20 € = " + mediasHorasBarata*1.2f);
		System.out.println("Tramo adicional: " + mediasHorasExtra + " x 1,00 € = " + mediasHorasExtra*1.0f);
		System.out.println("Base imponible: " + baseImponible + " €.");
		System.out.println("Recargo fin de semana (10%): " + recargoFinDeSemana);
		System.out.println("Recargo pérdida: " + recargoTicketPerdido + "€");
		System.out.println("IVA (21%): " + iva + "€");
		System.out.println("TOTAL: " + total + "€");
	}

}
