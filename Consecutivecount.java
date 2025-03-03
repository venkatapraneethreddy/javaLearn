package learnprogramming;

public class Consecutivecount {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 2, 3, 3, 1, 1, 1, 0, 4, 4, 4, 4, 4, 0};
        int n = a.length;

        if (n == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int count = 1, maxCount = 1, mostFrequent = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) { 
                count++;
                if (count > maxCount) { 
                    maxCount = count;
                    mostFrequent = a[i];
                }
            } else {
                count = 1; 
            }
        }

        System.out.println("Maximum consecutive occurrences: " + maxCount);
        System.out.println("Number with max consecutive occurrences: " + mostFrequent);
    }
}
