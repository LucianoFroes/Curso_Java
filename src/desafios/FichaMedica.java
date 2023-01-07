package desafios;

import java.util.Scanner;

public class FichaMedica {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o seu nome ?");
		String nome = entrada.nextLine();
		
		System.out.println("Qual a sua idade ?");
		int idade = entrada.nextInt();
		
		System.out.println("Qual a sua altura?");
		float altura = entrada.nextFloat();
		
		System.out.println("Você já fez algum Check Up ? (Digite 1 para 'sim' ou 2 para 'não')");
		int resp = entrada.nextInt();
	
			if (resp == 1) {
			System.out.println("Ótimo, parabéns! Você está com os seus exames em dia.");
			
				} else 	{
					System.out.printf("Você precisa de uma consulta médica senhor(a) %s! "
							+ "\nAqui está a sua ficha médica com as suas informações:"
							+ "\nNome: %s \n"
							+ "Idade: %d \n"
							+ "Altura: %.2f", nome, nome, idade, altura);
		
		entrada.close();
		
		}	
	}

}
