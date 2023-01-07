package aula59_ExeConceitosBasicos;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o seu peso: ");
		String peso = s.next().replace(",", ".");
		
		System.out.println("Digite a sua altura: ");
		String altura = s.next().replace(",", ".");
		
		double peso1 = Double.parseDouble(peso);
		double altura1 = Double.parseDouble(altura);
		
		altura1 = Math.pow(altura1, 2);
		
		double imc = peso1 /(altura1);
		
		System.out.printf("%.2f", imc);
		
		if (imc < 18.5) {
			System.out.println("\nVocê está muito magro!");
		}
		
		if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("\nVocê está com o peso normal!");
		}
		
		if (imc >= 25 && imc <= 29.9) {
			System.out.println("\nVocê está com sobrepeso!");
		}
		
		if (imc >= 30 && imc <= 39.9) {
			System.out.println("\nVocê está obeso!");
		}
		
		if (imc > 40) {
			System.out.println("\nVocê está um obeso mórbido!");
		}
		
		
		s.close();		
		
		
	}
	
}
