package aula86_ExeEstruturasControle;

import java.util.Scanner;

public class Exe5 {
	
	public static void main(String[] args) {
		
		//5- Criar um programa que receba um número e diga se ele é um número primo, utilizando o SWITCH.
		
		Scanner s = new Scanner(System.in);
		
			System.out.println("Digite algum número: ");
			int num = s.nextInt();
			int divisores = 0;
		
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
				divisores++;
				}
			}
		
		switch(divisores) {
			
		case 2: 
			System.out.printf("O número %d é primo.", num);
		break;
		
		default:
			System.out.printf("O número %d não é primo.", num);
		}
		
		s.close();
	}

}
