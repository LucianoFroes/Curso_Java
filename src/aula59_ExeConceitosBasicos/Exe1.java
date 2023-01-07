package aula59_ExeConceitosBasicos;

import java.util.Scanner;

public class Exe1 {

	
		public static void main(String[] args) {
			
			// 1- Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Conversor Fahrenheit para Celsius\n\nFahrenheit: ");
			double fah = entrada.nextDouble();
			
			double conversao = (fah - 32) / 1.8;
			
			System.out.printf("Celsius: %.2f", conversao);
			
			entrada.close();
			
		}
}
