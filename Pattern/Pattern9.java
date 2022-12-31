package Pattern;

import java.util.Scanner;

public class Pattern9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Rows you want in this pattern ");
        int n = sc.nextInt();
        System.out.println("Here! is Your pattern ");
        Patterns9(n);
        Pattern10(n);
        sc.close();
    }

    public static void Patterns9(int a) {
        System.out.println(" \t -->>Pattern 9 <<-- ");

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void Pattern10(int a) {
        System.out.println(" \t -->>Pattern 9 <<-- ");

        for (int i = 1; i <= a; i++) {
            for (int j = a - i; j <= a; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= a; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i = 1; i <= a - 1; i++) {
            for (int j = i; j <= a; j++) {
                System.out.print(" ");
            }
            for (int j = a - i; j <= a; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }
}
