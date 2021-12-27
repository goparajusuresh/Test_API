package programs;

public class String_create {

	public static void main(String[] args) {

		String s1="Hello";
		String s2="Hello"; //not create an object in String Constant Pool
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("Hai");
		String s4 = new String("Hai"); //Always create an object in heap memory
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}

}
