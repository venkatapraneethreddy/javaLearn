package learnprogramming;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i][j]=a[j][i];
			}
		}
		for(int r[]:b) {
			for(int res:r) {
				System.out.print(res+" ");
			}
			System.out.println();
		}
		

	}

}
