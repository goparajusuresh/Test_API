package polymorphism;


//Poymorphism method override concept => happen in different class with same method name, using inheritence concept

public class Polymorphism_Override {

	public static void main(String[] args) {
		
		Polymorphism_Parent p = new Polymorphism_Parent(); // Creating a parent class object
		
		Polymorphism_Parent c = new Polymorphism_Child(); // creating a child class object
		
		p.animalSound();
		p.Display();
		
		c.animalSound();
		c.Display();
		
	}
}