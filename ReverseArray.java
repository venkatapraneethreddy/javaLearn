package learnprogramming;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int x[]=new int[arr.length];
        
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            x[i]=arr[arr.length-1-i];
        }
        
        for(int y:x)
        System.out.print(y+" ");
    }
}

