package Pattern;

import java.util.Scanner;

// it is also A hill climbing pattern but with repeated Numners

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Rows you want in this pattern ");
        int n = sc.nextInt();
        System.out.println("Here! is Your pattern ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i);

            }
            System.out.println("");
        }

        Pattern8(n);
        Pattern6(n);
        sc.close();
    }

    public static void Pattern8(int a) {
        System.out.println(" \t -->>Pattern 8 <<-- ");

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }

    public static void Pattern6(int a) {
        System.out.println(" \t -->>Pattern 6 <<-- ");

        for (int i = 1; i <= a; i++) {
            for (int j = a - i + 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }

}
