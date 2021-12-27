package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpid(100);
		System.out.println(e.getEmpid());
	}
}
 

/* Encapsulation is Wrapping the data(variables) and methods together as a single unit/class.
 1. Encapsulation is to Achive Security(Data-Hiding)
    1.1 To achive encapsulation, Declare the variables of a class as "private"
 	1.2 Provide public setter & getter methods to modify and view the variables values 
 */