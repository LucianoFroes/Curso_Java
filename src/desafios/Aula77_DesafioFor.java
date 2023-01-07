package desafios;

public class Aula77_DesafioFor {
	
	public static void main(String[] args) {
		
//		String valor = "#";
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}
		
		
		// Versão do desafio
		// Não pode usar valor númerico pra controlar o laço!
		
		
		String valorFor = "#";
		for(String contador = "#"; !contador.equals("######"); contador = contador + "#") {
			System.out.println(valorFor);
			valorFor += "#";
		}
	}

}
