package learnprogramming;

public class Secondlargest {
    public static void main(String[] args) {
        int a[] = {21, 32, 12, 46, 7, 38};

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > largest) {
                secondlargest = largest;
                largest = num;
            } else if (num > secondlargest && num != largest) {
                secondlargest = num;
            }
        }

        if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println("The second largest number is: " + secondlargest);
        }
    }
}
