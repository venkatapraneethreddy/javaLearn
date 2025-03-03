package learnprogramming;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int count = sc.nextInt();
        sc.close();

        if (count < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.print(n1 + " " + n2);

        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
