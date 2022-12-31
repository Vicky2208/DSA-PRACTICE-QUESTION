package Recursion;

// To find the X^n(x to the power of n)

import java.util.Scanner;

public class XPowerN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 5;
        System.out.println("Enter The" + x + " To the power of number ");
        int n = sc.nextInt();
        int res = 1;
        // System.out.println(Enter The)
        // System.out.println("\n The Fabonicci sum of Numbers Up to " + n + " is :->>
        // ");
        System.out.print(xToPowerN(x, n));
        System.out.println("\n------------------------");
        System.out.println(xToPowerN2(x, n, res));
        sc.close();

    }

    public static int xToPowerN(int x, int n) {

        // Time Complexity :--> O(n)

        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        // int f = xToPowerN(x, i, n - 1);
        // int f1 = (x * f);
        // return f1;

        // Approach 2 :--> Time Complexity O(logn)
        if (n % 2 == 0) {
            int f = xToPowerN(x, n / 2) * xToPowerN(x, n / 2);
            return f;
        } else {
            int f = xToPowerN(x, n / 2) * xToPowerN(x, n / 2) * x;
            return f;
        }

    }

    // Iterative Approach //
    public static int xToPowerN2(int x, int n, int res) {
        int i = 1;
        while (i <= n) {
            res = res * x;
            i++;
        }
        return (res);

    }

}
