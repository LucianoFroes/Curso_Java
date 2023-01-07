package aula86_ExeEstruturasControle;

import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double num = 1;
		double soma = 0;
		
		while(num > 0) {
			System.out.println("\nDigite algum número: ");
			num = s.nextDouble();
				soma = num + soma;
			System.out.printf("\nA soma dos número é %.2f", soma);
			
		}
		s.close();
	}
	
}
