package learnprogramming;

public class MaxLengthWordInArray {

	public static void main(String[] args) {
		String a[]= {"tea","coffee","biscuit","hi"};
		int x=0;
		String y=a[0];
		for (int i=0;i<a.length-1;i++) {
			
			if(a[i].length() > x) {
				x=a[i].length();
				y=a[i];
			}
		}
System.out.println(x);
System.out.println(y);
}
}
