package desafios;

import java.util.Scanner;

public class DesafioConversao {	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu salário do mês retrasado: ");
		String valor1 = entrada.next().replace(",", "."); //replace é usado para substituição
		
		System.out.println("\nDigite o seu salário do mês passado: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.println("\nDigite o seu salário desse mês: ");
		String valor3 = entrada.next().replace(",", ".");
		
		System.out.println("Salário 1: " + valor1 + "\nSalário 2: " + valor2
				+ "\nSalário 3: " + valor3);
		
		double salario1 = Double.parseDouble(valor1);		
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double salMedia = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("Sua média salarial é: " + salMedia);
		
		entrada.close();
		
	}

}
