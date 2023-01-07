package aula59_ExeConceitosBasicos;

import java.util.Scanner;

public class Exe4 {

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);
   		
   		System.out.println("Digite um valor: ");
   		String texto = s.nextLine().replace(",", ".");
   		
   		double numero = Double.parseDouble(texto);
   		double numero2, numero3;

   		numero2 = Math.pow(numero, 2);
   		numero3 = Math.pow(numero, 3);
   		
   		System.out.printf("O número %.2f ao quadrado é %.2f\n"
   				+ "ao cubo é %.2f", numero, numero2, numero3 );
   		
   		s.close();
        
       }
   }