package desafios;

public class Aula43_DesafioArit {
	
	public static void main(String[] args) {
		
		byte a = (6 * (3 + 2));
		byte b = 3 * 2;
		byte c = ((1 - 5) * (2 - 7) / 2);
		byte d = 10;
		
		double potA = Math.pow(a, 2);
		double potC = Math.pow(c, 2);
		double potD = Math.pow(d, 3);
	
		double resultPot = ((potA / b) - (potC));
		double resultPot1 = Math.pow(resultPot, 3);
		double result = resultPot1 / potD;
		
		System.out.println(result);
	
	}

}
