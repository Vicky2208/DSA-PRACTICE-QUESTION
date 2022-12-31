package Pattern;

import java.util.Scanner;

public class Patterns17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Rows you want in this pattern ");
        int n = sc.nextInt();
        System.out.println("Here! is Your pattern ");

        Pattern17(n);
        sc.close();
    }

    public static void Pattern17(int a) {
        System.out.println(" \t -->>Pattern 16 <<-- ");

        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= a; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }

}
