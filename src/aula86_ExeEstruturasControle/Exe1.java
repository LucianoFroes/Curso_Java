package aula86_ExeEstruturasControle;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		
	// 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
		
		Scanner s = new Scanner(System.in);
	
	while(true) {	
		
		System.out.println("Informe algum número: ");
		String num = s.next();
		
		s.close();
		
		double numDoub = Double.parseDouble(num);
		
		if(numDoub > 0 && numDoub < 10) {
			System.out.print("O número informado está entre 0 e 10, ");
		} else {
			System.out.print("O número informado não está entre 0 e 10, ");
		}
		if(numDoub % 2 == 0) {
			System.out.print("e é par!\n");
		} else {
			System.out.print("e é ímpar!\n");
			}
		}
	}
}
