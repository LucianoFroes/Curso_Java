package desafios;

public class Aula47_DesafioLogico {
	
	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (	v ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		boolean resultado50, resultado30, resultadoNot = false;
		
		
		resultado50 = (trabalho1 && trabalho2);
		resultado30 = (trabalho1 || trabalho2);
		resultadoNot = resultado50 || resultado30;
		
//		System.out.println(resultado50);
//		System.out.println(resultado30);
//		System.out.println(resultadoNot);
		
		
		if (resultado50 == true) {	
				System.out.println("Ebaa! Vamos comprar a TV de 50 polegadas e tomar sorvete!");	
			}
		
		if (resultado30 == true) {
			System.out.println("Ótimo! Vamos comprar a TV de 30 polegadas e tomar sorvete!");
			}
		
		if (resultadoNot == false) {
			System.out.println("Vamos ficar em casa e não tomar sorvete, bom que não engorda!");
			}
	}
	
}
