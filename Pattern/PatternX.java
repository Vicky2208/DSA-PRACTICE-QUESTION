package Pattern;

import java.util.Scanner;

public class PatternX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of X pattern");
        int n = sc.nextInt();
        int count = 0;
        int count2 = n - 2;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == j) {
                    System.out.print(j + " ");

                } else {
                    System.out.print(" ");
                }
            }

            for (int k = 1; k <= (2 * n - (n / 2) - i - 1); k++) {
                if (k > (n / 2)) {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= 1; k++) {
                if (i <= n - 1) {
                    System.out.print(k + count + " ");
                }
            }
            count++;

            System.out.println("");

        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n; j++) {

                if (i == j) {
                    System.out.print(j + " ");

                } else {
                    System.out.print(" ");
                }
            }

            for (int k = 1; k < (2 * n - (n / 2) - i); k++) {
                if (k > (n / 2)) {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= 1; k++) {
                if (i <= n - 1) {
                    System.out.print(k + count2 + " ");
                }
            }
            count2--;

            System.out.println("");

        }
        sc.close();
    }
}
