package main.EjerciciosRepasoTipoExamen;


import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		/*Solicitamos el número de días*/
		System.out.println("Introduzca el número de días que quiere registar: ");
		int totalDias=teclado.nextInt();
		int dia=1;
		int alumnosPorDia=0;
		int totalAlumnosRegistrados=0;
		int mayorAsistencia=0,menorAsistencia=0;
		int diaMayorAsistencia=0, diaMenorAsistencia=0;
		while(dia<=totalDias) {
				
			System.out.println("Introduzca número de alumnos para el día " + dia + ":");
			alumnosPorDia=teclado.nextInt();
			
					
			while (alumnosPorDia < 0 || alumnosPorDia>30) {
				System.out.println("Número de alumnos incorrecto.");
				System.out.println("Introduzca número de alumnos para el día " + dia + ":");
				alumnosPorDia=teclado.nextInt();
			}
			if (dia==1) { //Caso del primer dia, no conocemos numeros de otros dias
				mayorAsistencia=alumnosPorDia;
				menorAsistencia=alumnosPorDia;
				diaMayorAsistencia=1;
				diaMenorAsistencia=1;
			}else { //Para el resto de dias
				
				if (alumnosPorDia>mayorAsistencia) {
					mayorAsistencia=alumnosPorDia;
					diaMayorAsistencia=dia;
				}
				if (alumnosPorDia<menorAsistencia) {
					menorAsistencia=alumnosPorDia;
					diaMenorAsistencia=dia;
				}
			}
			
			
			
			
			
			totalAlumnosRegistrados = totalAlumnosRegistrados + alumnosPorDia;
			
			
			
			
			dia++;
		}
		
		System.out.println("Total de alumnos que han asistido: " + totalAlumnosRegistrados);
		System.out.println("Día con mayor asistencia: " + diaMayorAsistencia);
		System.out.println("Día con menor asistencia: " + diaMenorAsistencia);
		
		
	}

}
