package learnprogramming;

import java.util.Arrays;

public class Sorted {

	public static void main(String[] args) {
		int a[]= {3,2,15,32,21,17};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[a.length-2]);//second largest
		System.out.println("sorted order:"+Arrays.toString(a));
	}

}
