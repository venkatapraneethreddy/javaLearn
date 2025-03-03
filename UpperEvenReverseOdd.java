package learnprogramming;

public class UpperEvenReverseOdd {

	public static void main(String[] args) {
		String s1="java is super";
		
		String s2[]=s1.trim().split("\\s+");  //split at one or more spaces
		
		String s6[]=s2;
		for(int i=0;i<s6.length;i++) {
			if(i%2==0) {
				s6[i]=s6[i].toUpperCase();
			}
			else {
				s6[i] = reverseWord(s6[i]);
			}
		}
		
		String result = String.join(" ", s6);
        System.out.println("Modified String: " + result);

	}
	public static String reverseWord(String word)//method to reverse the words
	{
        return new StringBuilder(word).reverse().toString();

	}

}
