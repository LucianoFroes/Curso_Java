package aula86_ExeEstruturasControle;

import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		
		/*
		 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero
		 *  aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. 
		 *  Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se 
		 *  o número inserido é maior ou menor do que o número armazenado.
		 * 
		 */
		
		Scanner s = new Scanner(System.in);
		int numSorte = 32;
		
		System.out.println("------- JOGO DA ADIVINHAÇÃO -------"
				+ "\n\nTente adivinhar o número da sorte!(0 - 100)");
		
		for(int i = 10; i >= 1; i--) {
				System.out.printf("\nVocê tem %d tentativas:", i);
		int tent = s.nextInt();
		
			if(tent == numSorte) {
			System.out.println("\nVocê conseguiu, parabéns!");
			break;
			}else if(i == 1) {
				System.out.println("\nVocê perdeu!");
			break;
			}else if(tent < numSorte) {
				System.out.printf("\nO número da sorte é maior que %d", tent);
			}else if(tent > numSorte) {
				System.out.printf("\nO número da sorte é menor que %d", tent);
				
			
		s.close();
		}
	}
}
	}