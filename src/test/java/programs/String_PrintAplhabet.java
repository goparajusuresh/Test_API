package programs;

//Print only alphabets in the given string(avoid numbers)
public class String_PrintAplhabet {

	public static void main(String[] args) {

		String str = "A1p2p3l4e5 s@u#r$e$sh";
		str = str.replaceAll("[^a-zA-Z]", ""); // if you want to print only numbers use [^0-9]
		System.out.println(str); 
	}
}

/*
  ^ - means not
  a-z - means any character between a and z 
  A-Z - means any character between A and Z
 */