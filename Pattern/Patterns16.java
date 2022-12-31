package Pattern;

import java.util.Scanner;

public class Patterns16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Rows you want in this pattern ");
        int n = sc.nextInt();
        System.out.println("Here! is Your pattern ");

        Pattern18(n);
        Pattern16(n);
        Pattern20(n);
        sc.close();

    }

    public static void Pattern18(int a) {
        System.out.println(" \t -->>Pattern 18 <<-- ");

        for (int i = 1; i <= a; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + a - j;
            }
            System.out.println("");
        }

    }

    public static void Pattern16(int a) {
        System.out.println(" \t -->>Pattern 16 <<-- ");
        int value = 1;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println("");
        }

    }

    public static void Pattern20(int a) {
        System.out.println(" \t -->>Pattern 20 <<-- ");
        int value = 1;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println("");
        }

    }

}
