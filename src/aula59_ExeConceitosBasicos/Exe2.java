package aula59_ExeConceitosBasicos;

import java.util.Scanner;

public class Exe2 {
	
	public static void main(String[] args) {
		
			
			// 2 - Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Conversor Celsius para Fahrenheit\n\nCelsius: ");
			double cel = entrada.nextDouble();
			
			double conversao = cel * 1.8 + 32;
			
			System.out.printf("Fahrenheit: %.2f", conversao);
			
			entrada.close();
		
	}

}
