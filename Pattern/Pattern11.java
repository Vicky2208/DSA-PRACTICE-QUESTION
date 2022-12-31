package Pattern;

import java.util.Scanner;

public class Pattern11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Rows you want in this pattern ");
        int n = sc.nextInt();
        System.out.println("Here! is Your pattern ");
        Patterns11(n);
        sc.close();
    }

    public static void Patterns11(int a) {

        for (int i = 1; i <= a; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }

}
