package Pattern;

import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Rows you want in this pattern ");
        int n = sc.nextInt();
        System.out.println("Here! is Your pattern ");
        Patterns12(n);
        Pattern15(n);
        sc.close();
    }

    public static void Patterns12(int a) {
        System.out.println(" \t -->>Pattern 12 <<-- ");

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern15(int a) {
        System.out.println(" \t -->>Pattern 15 <<-- ");

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {

                if (i % 2 != 0 && j % 2 != 0) {
                    System.out.print("1");
                } else if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
