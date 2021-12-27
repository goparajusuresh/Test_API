package abstraction;

//dog is the child class which is extends the animal is the parent class
public class Dog extends Animal {
	
	Dog() {
		System.out.println("Dog constructor");
	}
	
	public void sound() {
		
		System.out.println("Dog makes sound: bow bowwww...");
		
	}

}