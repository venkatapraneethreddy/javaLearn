package learnprogramming;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s7="Hi Hello Namaste"; //reverse each word in the string
        String s8[]=s7.split(" ");
        for (int i=0;i<s8.length;i++) {
        	s8[i]=reverseWord(s8[i]);
        }
        for(String s9:s8) {
        System.out.print(s9+" ");
        }

	}
	public static String reverseWord(String word)//method to reverse the words
	{
        return new StringBuilder(word).reverse().toString();

	}

}
