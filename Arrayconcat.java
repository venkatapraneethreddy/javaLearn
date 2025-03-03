package learnprogramming;

public class Arrayconcat {

	public static void main(String[] args) {
		int i[]= {1,2,3,4};
		int j[]= {5,6,7};
		
		int result[]=new int[i.length+j.length];
		for(int x=0;x<i.length;x++) {
			result[x]=i[x];
		}
		
		for(int x=0;x<j.length;x++) {
			result[i.length+x]=j[x];
		}
		
		for(int res:result)
		System.out.println(res);

	}

}
