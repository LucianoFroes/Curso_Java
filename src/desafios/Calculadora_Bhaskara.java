package desafios;

public class Calculadora_Bhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a = 2, b = (-7), c = 3;
		
		double delta = (b * b) - (4 * a * c); 
		
		System.out.println("valor de delta: " + delta);
		
		double bhaskaraPosit = ((-(b) + Math.sqrt(delta))/ (2 * a));
		double bhaskaraNegativ = ((-(b) - Math.sqrt(delta))/ (2 * a));
		
		System.out.println("Os valores de Bhaskara são: " + bhaskaraPosit + bhaskaraNegativ);
	
	// Math.sqrt -> representa raiz quadrada
		
	}

}
