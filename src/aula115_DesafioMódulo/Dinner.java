package aula115_DesafioMódulo;

public class Dinner {
	
	public static void main(String[] args) {
		
		Food f1 = new Food("Camarão", 0.630);
		Food f2 = new Food("X-Tudo", 0.910);

		Person p = new Person("Luciano", 78.7);
		
		System.out.println(p.Introduce());
		p.Eat(f1);
		
		System.out.println(p.Introduce());
		p.Eat(f2);
		
		System.out.println(p.Introduce());
	}

}
