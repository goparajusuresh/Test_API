package polymorphism;

//This is parent class having method
public class Polymorphism_Child extends Polymorphism_Parent {

	// this is a overriden method means same method with parameters are having in
	// parent class as well
	public void animalSound() {
		// code changes
		System.out.println("makes sound in child class");
	}

	// this is not a overriden method bcz we modified signature
	public void Display(int a) {
		System.out.println("display method in child class=> not overriden method");
	}

	// this is a overriden method , same as is in parent class
	public void Display() {
		System.out.println("display method in child class=>overriden method");
	}
}
