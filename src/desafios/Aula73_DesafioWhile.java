package desafios;

import java.util.Scanner;

public class Aula73_DesafioWhile {
	
	public static void main(String[] args) {
		
		/*
		 * Calcule a média das notas de uma classe, o professor não sabe a quantidade de notas e alunos.
		 * O usuário deve digitar uma nota válida de 10 a 0, após isso você deve armazenar as notas na variável
		 * "total" e sempre que inserir mais uma nota, deve-se fazer a soma das mesmas.
		 * 
		 * Utilize outra variável para mostrar quantas notas foram adicionadas, para finalizar o programa
		 * o usuário deve digitar -1, assim devemos calcular a média das notas.
		 *  
		 */
		
		Scanner s = new Scanner(System.in);
		
		int qntNotas = 0;
		String nota = "";
		double total = 0;
		
		while(!nota.equals("-1")) {
			
			System.out.println("Digite a nota do aluno: ");
			nota = s.next().replace(",", ".");
			
		double notaDoub = Double.parseDouble(nota);
			
			if(notaDoub < 0 || notaDoub >10) {
				System.out.println("Digite uma nota válida!\n");
			} else {
				qntNotas ++;
				System.out.println("Quantidade de notas: " + qntNotas);
			}
		total += notaDoub;
		double media = total / qntNotas;
			
			if(nota.equals("-1")){
				System.out.printf("A média é: %.2f" , media);
			}
		}
		s.close();
	}

}
