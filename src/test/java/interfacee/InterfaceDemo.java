package interfacee;

public class InterfaceDemo {

	public static void main(String[] args) {		
		Cat c = new Cat();
		c.makeSound();
		c.display();		
	}
}


/*
 1. Interface contains abstract methods, does not have body
 2. By defaualt varialbes are public static final and should declare variable (Ex: int a=10;)
 3. By default methods are public abstract
 4. 100% abstraction we can achieve through interface
 5. also we can achieve multiple inheritence
 6. use keyword implements
 */