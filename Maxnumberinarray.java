package learnprogramming;

public class Maxnumberinarray	
 {
	public static void main(String[] args) {
	int x[]= {1,2,3,4,5};
	int index=0;
	int max=x[0];
	for(int i=0;i<x.length-1;i++) {
		
		if(x[i]>max) {
			max=x[i];
			index=i;
		}
	
	}
	System.out.println(max);
	System.out.println(index);
	}
 }
