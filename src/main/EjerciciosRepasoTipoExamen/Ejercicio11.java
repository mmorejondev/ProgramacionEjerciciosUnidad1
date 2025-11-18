package main.EjerciciosRepasoTipoExamen;


import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int pin; //el pin que introduce el usuario
		int pinCorrecto=2024;
		int intentosUsuario=0; //controla cuantos intentos lleva el usuario
		int maxIntentos=3;
		int intentosCaptcha=0;
		int numeroCaptcha1,numeroCaptcha2;
		int sumaCaptchaCorrecta;
		int captchaUsuario;
		Random generador = new Random();
					
		System.out.println("Ingrese el PIN: ");
		pin = teclado.nextInt();
		intentosUsuario++;
		
		while(intentosUsuario<maxIntentos && pin!=pinCorrecto) {
			
			System.out.println("Pin Incorrecto");
			System.out.println("Ingrese el PIN: ");
			pin = teclado.nextInt();
			intentosUsuario++;
		}
		
		
		if (pin==pinCorrecto) {
			System.out.println("PIN CORRECTO");
			//Generar y comprobar el CAPTCHA.
			numeroCaptcha1=generador.nextInt(10);
			numeroCaptcha2=generador.nextInt(10);
			sumaCaptchaCorrecta = numeroCaptcha1+numeroCaptcha2;
						
			System.out.println("Resuelva el siguiente Captcha: ");
			System.out.println(numeroCaptcha1 + " + " + numeroCaptcha2 + " = ");
			captchaUsuario = teclado.nextInt();
			intentosCaptcha++;	
			while (captchaUsuario!=sumaCaptchaCorrecta && intentosCaptcha<maxIntentos) {
			
				numeroCaptcha1=generador.nextInt(10);
				numeroCaptcha2=generador.nextInt(10);
				sumaCaptchaCorrecta = numeroCaptcha1+numeroCaptcha2;
							
				System.out.println("Resuelva el siguiente Captcha: ");
				System.out.println(numeroCaptcha1 + " + " + numeroCaptcha2 + " = ");
				captchaUsuario = teclado.nextInt();
				intentosCaptcha++;	
			}
			
			
			if (captchaUsuario==sumaCaptchaCorrecta) {
				System.out.println("LOGIN CORRECTO.");
			}else {
				System.out.println("Ha superado el limite de intentos de Captcha.");
				System.out.println("CUENTA BLOQUEADA.");
			}
			
		}else {
			System.out.println("PIN INCORRECTO. HA SUPERADO EL LÍMITE DE INTENTOS DE PIN.");
			System.out.println("CUENTA BLOQUEADA.");
			
		}
		
		
		
		
		
		
		/*if (intentosUsuario>maxIntentos) {
			System.out.println("Ha superado el límite de intentos.");
			System.out.println("Cuenta bloqueada.");
		}*/
		
		
		
	}

}
