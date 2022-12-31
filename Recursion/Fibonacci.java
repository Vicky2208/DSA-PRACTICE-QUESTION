package Recursion;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        // System.out.println(Enter The)
        System.out.println("\n The Fabonicci sum of Numbers Up to " + n + " is :->> ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\n");
        fibonicci2(n, a, b);
        sc.close();

    }

    // Recursion Approach
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        System.out.print(n + " ");
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    // Iterative Approach //
    public static void fibonicci2(int n, int a, int b) {
        System.out.print(a + " ");
        System.out.print(b + " ");
        int i = 0;

        while (i < n - 2) {

            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }

    }

}
