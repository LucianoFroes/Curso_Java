package aula59_ExeConceitosBasicos;

import java.util.Scanner;

public class Exe6 {
	
	public static void main(String[] args) {
		
	// 	Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando 
	//  a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta.
		
		
		System.out.println("Equação ax² + bx + c = 0");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int a = s.nextInt();
		
		System.out.println("Digite o valor de A:");
		int b = s.nextInt();
	
		System.out.println("Digite o valor de A:");
		int c = s.nextInt();
		
		double b2 = Math.pow(b, 2);
		double delta = b2 - 4 * a * c; 
		
		System.out.println("Valor de Delta é: " + delta);
		
		double deltaRaiz = Math.sqrt(delta);
		
		double eqPositiv = (-b + deltaRaiz) / 2 * a;
		double eqNegativ = (-b - deltaRaiz) / 2 * a;
		
		System.out.printf("Resultado x1 é %.2f\n"
				+ "Resultado x2 é %.2f", eqPositiv, eqNegativ);
		
		s.close();
	}

}
