package polymorphism;

// Poymorphism method overloading concept => happen in single class with same method name, and signature is differ(no.of, type, sequence parameters)
public class Polymorphism_Overloading {

	public static void main(String[] args) {
		Add(10, 20);
	}

	public static void Add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public static void Add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);
	}

}
