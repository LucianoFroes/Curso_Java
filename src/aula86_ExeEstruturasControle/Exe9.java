package aula86_ExeEstruturasControle;

import java.util.Scanner;

public class Exe9 {
	
	public static void main(String[] args) {
		
		//9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
		
		Scanner s = new Scanner(System.in);
		double maiorValor = 0;
		
		for(int i = 0; i <=10; i++) {
			System.out.println("Digite o número: ");
			double num = s.nextDouble();
			
			if(num > maiorValor) {
				maiorValor = num;
			}
			
		}
		
		System.out.printf("O maior valor é %.2f", maiorValor);
		
		s.close();
	}

}
