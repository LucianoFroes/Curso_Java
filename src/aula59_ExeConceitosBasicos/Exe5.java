package aula59_ExeConceitosBasicos;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da base do triângulo(cm):");
		String val1txt = s.nextLine();
		
		System.out.println("Digite o tamanho da altura do triângulo(cm):");
		String val2txt = s.nextLine();
		
		double base = Double.parseDouble(val1txt);
		double altura = Double.parseDouble(val2txt);
		
		double area = base * altura / 2;
		
		System.out.println("A área do triângulo é: " + area);
		
		s.close();
		
		
	}
	
}
