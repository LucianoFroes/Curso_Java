package aula86_ExeEstruturasControle;

import java.util.Scanner;

public class Exe3 {
	
	public static void main(String[] args) {
		
	// 3. Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno
	//for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do 
	//que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
		
		Scanner s = new Scanner(System.in);
		String valor = "";
		double nota = 0;
		double valorSoma = 0;
		
		for (int i = 0; i <= 1 ; i++) {
			System.out.println("Informe sua nota: ");
			valor = s.next().replace(",", ".");
			
			nota = Double.parseDouble(valor);
			valorSoma = valorSoma + nota;
		}
			double media = (valorSoma)/ 2;
		
			if(nota >= 0 && nota <= 10) {
				System.out.printf("Sua média é: %.2f\n", media);
			}else {
				System.out.println("Digite uma nota válida!");
				}
			
			if (media >= 7) {
				System.out.println("Parabéns você foi Aprovado!");
			}else if(media < 7 && media >= 4) {
				System.out.println("Você está de Recuperação!");
			}else {
				System.out.println("Reprovado!");
		}
		
		s.close();
	}

}
