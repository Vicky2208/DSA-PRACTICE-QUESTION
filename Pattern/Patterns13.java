package Pattern;

import java.util.Scanner;

public class Patterns13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Rows you want in this pattern ");
        int n = sc.nextInt();
        System.out.println("Here! is Your pattern ");
        Pattern13(n);
        sc.close();
    }

    public static void Pattern13(int a) {

        System.out.println(" \t -->>Pattern 13 <<-- ");

        for (int i = 1; i <= a; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= a; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = a; i > 1; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i - 1; j <= a; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
