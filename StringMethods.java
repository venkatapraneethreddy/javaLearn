package learnprogramming;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String s1="java is super";
		System.out.println(s1.length()); //length of the string
		
		String s2[]=s1.trim().split("\\s+");  //split at one or more spaces
		System.out.println(s2.length);// print the number of words in string
		
		int count=0;
		char s3[]=s1.toCharArray(); // number of times the selected character is repeating
		for(int i=0;i<s3.length;i++) {
			if(s3[i]=='a') {
				count++;
			}
		}
		System.out.println(count);
		
		char s4[]=new char[s3.length]; //reverse of the string
		for (int i=s3.length-1;i>=0;i--) {
			s4[s3.length-i-1]=s3[i];
		}
		for(char s5:s4) {
		System.out.print(s5);
		}
		
		System.out.println();    
        
	}
	

}
