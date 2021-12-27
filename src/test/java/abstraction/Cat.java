package abstraction;

//cat is the child class which is extends the animal, is the parent class
public class Cat extends Animal {

	Cat() {
		System.out.println("cat constructor");
	}

	@Override
	void sound() {
		System.out.println("cat makes sound meow meowww...");
	}
}
