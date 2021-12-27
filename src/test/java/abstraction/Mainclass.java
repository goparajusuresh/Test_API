package abstraction;

public class Mainclass {

	private static void main(String[] args) {

		//Animal an = new Animal(); // we can create an instance for abstract class
		Animal d = new Dog();   //upcasting
		d.sound();

		Cat c = new Cat(); //downcasting
		c.sound();
	}
}

/******** Abstract class Rules **************
 Abstract is the process of hiding the implementation details and showing only functionality to the user. 
1. An abstract class can have constructor
2. we can have an abstract class without any abstract method
3. Abstract classes can also have final methods (methods that cannot be overridden).
4. we are not allowed to create an object for abstract class
5. we can define static methods in an abstract class

 */