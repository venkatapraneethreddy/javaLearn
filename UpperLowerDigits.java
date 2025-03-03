package learnprogramming;

public class UpperLowerDigits {

	public static void main(String[] args) {
		 String s="Hello 22KB1A05I7"; 
	        char c[]=s.toCharArray();
	        int u=0,l=0,d=0;
	        for(int i=0;i<c.length;i++) {
	        	if(Character.isUpperCase(c[i])) {
	        		u++;
	        	}
	        	else if(Character.isLowerCase(c[i])) {
	        		     l++;
	        	}
	        	else if(Character.isDigit(c[i])) {
	   		     d++;
	   	}
	        }
	        System.out.println("upper case:"+u);
	        System.out.println("lower case:"+l);
	        System.out.println("digits:"+d);

	}

}
