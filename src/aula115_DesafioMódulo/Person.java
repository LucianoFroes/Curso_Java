package aula115_DesafioMódulo;

public class Person {
	
	String name;
	double kg;
	
	Person(String name, double kg){
		this.name = name;
		this.kg = kg;
	}
	
	void Eat(Food food){
		if(food != null) {
			this.kg += food.foodKg;
		}
	}
	String Introduce(){
		return "Olá eu sou o " + name + " e tenho " + kg + " Kg.";
	}
}
