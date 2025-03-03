package learnprogramming;

public class MinLengthWordInArray {

	public static void main(String[] args) {
		String a[]= {"tea","coffee","biscuit","hi"};
		int x=0;
		String y=a[0];
		for (int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length;j++) {
			if(a[i].length()<a[j].length()) {
				x=a[i].length();
				y=a[i];
			}
			else {
				x=a[j].length();
				y=a[j];
			}
				
		}
		}
System.out.println(x);
System.out.println(y);

}
}
