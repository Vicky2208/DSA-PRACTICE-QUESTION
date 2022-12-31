package Pattern;

import java.util.Scanner;

public class Patterns14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Rows you want in this pattern ");
        int n = sc.nextInt();
        System.out.println("Here! is Your pattern ");
        Pattern13(n);
        sc.close();
    }

    public static void Pattern13(int a) {

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a - i; j++) {
                System.out.print(1);
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i);

            }
            System.out.println("");
        }

    }

}
