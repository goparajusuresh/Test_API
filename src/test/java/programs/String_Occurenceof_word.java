package programs;

public class String_Occurenceof_word {

	public static void main(String[] args) {

		String str = "There is always a way for problem but problem should not be the way for your life";
		String word = "way";

		String a[] = str.split(" ");
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (word.equals(a[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}
/*
 
  Print duplicate words in the given string
 
 
 String words[] = string.split(" ");  

for(int i = 0; i < words.length; i++) {  
    count = 1;  
    for(int j = i+1; j < words.length; j++) {  
        if(words[i].equals(words[j])) {  
            count++;  
            //Set words[j] to 0 to avoid printing visited word  
            words[j] = "0";  
        }  
    }  
      
    //Displays the duplicate word if count is greater than 1  
    if(count > 1 && words[i] != "0")  
        System.out.println(words[i]);  
}   */