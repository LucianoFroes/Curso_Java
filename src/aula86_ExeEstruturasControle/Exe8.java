package aula86_ExeEstruturasControle;

import java.util.Scanner;

public class Exe8 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String texto = s.next();
		int contTexto = texto.length()-1;
		
		for(int i = 0; i <= contTexto; i++)
		
		System.out.println(texto.charAt(i));
		
		s.close();
	}

}
