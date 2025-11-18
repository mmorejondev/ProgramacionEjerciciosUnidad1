package main.EjerciciosRepasoTipoExamen;


import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int sueldoBase=0;
		int dietas=0;
		int sueldoBruto=0;
		float sueldoNeto=0.0f;
		float retencionIRPF=0.0f;
		float irpfSoltero=0.25f;
		float irpfCasado=0.20f;
		
		//Pedimos los datos al usuario
				
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seleccione tipo de empleado: ");
		System.out.println("1.- Programador Junior");
		System.out.println("2.- Programador Senior");
		System.out.println("3.- Jefe de Proyecto");
		int tipoEmpleado = teclado.nextInt();
		System.out.println("Introduzca dias de viaje: ");
		int diasDeViaje = teclado.nextInt();
		System.out.println("Estado civil: ");
		System.out.println("1.- Soltero");
		System.out.println("2.- Casado");
		int estadoCivil = teclado.nextInt();
		
		
		
		
		//En base a las condiciones calculamos su salario bruto:
		//Dependiendo del cargo
		if (tipoEmpleado==1) {
			sueldoBase=1100;
		}else if(tipoEmpleado==2) {
			sueldoBase=1500;
		}else if (tipoEmpleado==3) {
			sueldoBase=1700;
		}
				
		//Dependiendo de los dias de viaje
		dietas = diasDeViaje*30;
		//Calculamos el salario sumandole las dietas
		
		sueldoBruto=sueldoBase + dietas;
		
		
		//Dependiendo del estado civil, calculamos el sueldo neto
		//restando la retención por IRPF
		if (estadoCivil==1) {
			retencionIRPF = sueldoBruto*irpfSoltero;
			sueldoNeto = sueldoBruto - retencionIRPF;
		}else if(estadoCivil==2){
			retencionIRPF = sueldoBruto*irpfCasado;
			sueldoNeto = sueldoBruto - retencionIRPF;
		}
		
		
		System.out.println("           Nómina del Empleado         ");
		System.out.println("_______________________________________");
		System.out.println("Sueldo base: " + sueldoBase);
		System.out.println("Dietas (" + diasDeViaje + " días de viaje): " + dietas);
		System.out.println("Sueldo Bruto: " + sueldoBruto);
		System.out.println("_______________________________________");
		System.out.println("Retención por IRPF: " + retencionIRPF);
		System.out.println("_______________________________________");
		System.out.println("Sueldo neto: " + sueldoNeto);
		System.out.println("_______________________________________");

		
		
	}

}
