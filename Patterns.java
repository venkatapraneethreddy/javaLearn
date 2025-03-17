package learnprogramming;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern number (1-22):");
        int patternNumber = sc.nextInt();
        System.out.println("Enter the size (n):");
        int n = sc.nextInt();
        sc.close();

        switch (patternNumber) {
            case 1 -> pattern1(n);
            case 2 -> pattern2(n);
            case 3 -> pattern3(n);
            case 4 -> pattern4(n);
            case 5 -> pattern5(n);
            case 6 -> pattern6(n);
            case 7 -> pattern7(n);
            case 8 -> pattern8(n);
            case 9 -> pattern9(n);
            case 10 -> pattern10(n);
            case 11 -> pattern11(n);
            case 12 -> pattern12(n);
            case 13 -> pattern13(n);
            case 14 -> pattern14(n);
            case 15 -> pattern15(n);
            case 16 -> pattern16(n);
            case 17 -> pattern17(n);
            case 18 -> pattern18(n);
            case 19 -> pattern19(n);
            case 20 -> pattern20(n);
            case 21 -> pattern21(n);
            case 22 -> pattern22(n);
            default -> System.out.println("Invalid pattern number!");
        }
    }

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    public static void pattern10(int n) {
        pattern2(n);
        pattern5(n - 1);
    }

    public static void pattern11(int n) {
        int start;
        for (int i = 0; i < n; i++) {
            start = (i % 2 == 0) ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        int space = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) System.out.print(j + 1);
            for (int j = 0; j < space; j++) System.out.print(" ");
            space -= 2;
            for (int j = i + 1; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) System.out.print(num++ + " ");
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            char val = 'A';
            for (int j = 0; j <= i; j++) System.out.print(val++ + " ");
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char val = 'A'; val < 'A' + (n - i); val++) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        char val = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) System.out.print(val + " ");
            System.out.println();
            val++;
        }
    }

    public static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) System.out.print(" ");
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                ch = (j < breakpoint) ? (char) (ch + 1) : (char) (ch - 1);
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('A' + (n - 1)); ch >= (char) ('A' + (n - 1) - i); ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void pattern19(int n) {
        for (int i = 0, s = 0; i < n; i++, s += 2) {
            for (int j = 0; j < n - i; j++) System.out.print("*");
            for (int j = 0; j < s; j++) System.out.print(" ");
            for (int j = 0; j < n - i; j++) System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern20(int n) {
        pattern7(n);
        pattern8(n);
    }

    public static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i == 0 || j == 0 || i == n - 1 || j == n - 1) ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static void pattern22(int n) {
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) System.out.print(n - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j)));
            System.out.println();
        }
    }
}
