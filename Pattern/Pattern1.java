package Pattern;

import java.util.Scanner;

// it is a hill climbing Pattern of numners in asscending order
public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Rows you want in this pattern ");
        int n = sc.nextInt();
        System.out.println("Here! is Your pattern ");
        Pattern0(n);
        Pattern5(n);
        Pattern4(n);
        Pattern7(n);
        sc.close();

    }

    public static void Pattern0(int a) {
        System.out.println(" \t -->> Pattern 0 <<-- ");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void Pattern4(int a) {
        System.out.println(" \t -->>Pattern 2 <<-- ");

        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }

    public static void Pattern5(int a) {
        System.out.println(" \t -->>Pattern 1 <<-- ");

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }

    public static void Pattern7(int a) {
        System.out.println(" \t -->>Pattern 3 <<-- ");

        for (int i = 1; i <= a; i++) {
            for (int j = a; j > a - i; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }

}
