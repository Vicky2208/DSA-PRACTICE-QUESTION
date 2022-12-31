package Recursion;

import java.util.Scanner;

public class FirstandLast {
    static int first = -1;
    static int last = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String ");
        String n = sc.nextLine();
        StringBuilder sb = new StringBuilder(n);
        int i = 0;
        System.out.println("Enter The Character From the String You want to Find");
        char s = sc.next().charAt(0);
        firstandLast(n, s, sb, i);
        sc.close();

    }

    // Recursion Approach //
    public static void firstandLast(String n, char s, StringBuilder sb, int i) {
        if (i == sb.length()) {
            System.out.println("Elemment Found From First is at index:->>" + first);
            System.out.println("Elemment Found From last is at index :->>" + (last));
            return;
        }
        if (sb.charAt(i) == s) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        firstandLast(n, s, sb, i + 1);

    }

}
