package Pattern;

import java.util.Scanner;

// It is pattern that looks like |> "Triangle that stick in wall"

public class Pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Rows you want in this pattern ");
        int n = sc.nextInt();
        System.out.println("Here! is Your pattern ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println("");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {

                System.out.print(j);
            }
            System.out.println("");
        }
        sc.close();
    }
}
