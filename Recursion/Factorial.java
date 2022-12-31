package Recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int n = sc.nextInt();
        int num = 1;
        // System.out.println(Enter The)
        System.out.print("\n The Factorial of Numbers Up to " + n + " is :->> " + factorial(n));
        System.out.print("\n The Factorial of Numbers Up to " + n + " is :->> " + factorial2(n));
        printNo(num);
        sc.close();

    }

    // Recursion Approach // // Recursive Approach-2
    public static int factorial(int n) {

        if (n == 1) { // if(n <= 1){
            return 1; // return n;
        } else { // }
            int f1 = factorial(n - 1); // return n * factorial(n-1);
            int f = n * f1;
            return f;
        }

    }
    // Iterative Approach //

    public static int factorial2(int n) {
        int sum = 1;
        if (n == 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            int f = (n - i);
            sum *= f;
        }
        return sum;
    }

    public static void printNo(int num) {
        if (num > 5) {
            return;
        }

        printNo(num + 1);
        System.out.println("" + num);

    }

}
