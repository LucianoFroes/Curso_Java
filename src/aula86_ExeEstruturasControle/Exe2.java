package aula86_ExeEstruturasControle;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe algum ano: ");
		double ano = s.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.printf("O ano %.0f é bissexto!", ano);
		}else {
			System.out.println("O ano informado não é bissexto!");
		}
		
		s.close();
		
	}
	
}
