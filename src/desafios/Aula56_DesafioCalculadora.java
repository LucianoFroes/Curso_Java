package desafios;

import java.util.Scanner;

public class Aula56_DesafioCalculadora {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro número.");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número.");
		double num2 = entrada.nextDouble();
		
		System.out.println("Escolha a operação: + - / %");
		String operacao = entrada.next();
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		
		entrada.close();		
		
	}
	
}
