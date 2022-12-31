package Recursion;

import java.util.Scanner;

// Print Sum of First Naturtal Number  

public class SumOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int n = sc.nextInt();
        int sum = 0, i = 0;
        // System.out.println(Enter The)
        System.out.print("\n The sum of Numbers Up to " + n + " is :->> ");
        System.out.println(PrintSum(n));

        System.out.println("------------------------");

        System.out.println(PrintSum2(n, i, sum));
        sc.close();

    }

    // Recursive Approach //
    public static int PrintSum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + PrintSum(n - 1);
        // System.out.println(i);
    }

    // Iterative Approach //

    public static int PrintSum2(int n, int i, int sum) {

        if (n == 0 || n == 1) {
            return n;
        }

        for (i = 0; i <= n; i++) {
            sum += i;

        }
        return sum;

    }

}
