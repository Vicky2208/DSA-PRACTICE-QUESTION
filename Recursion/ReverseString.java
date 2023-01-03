package Recursion;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String ");
        String n = sc.nextLine();
        StringBuilder sb = new StringBuilder(n);
        int i = sb.length() - 1;
        // System.out.println(Enter The)
        System.out.print("\n The Reverse Of " + n + " is :->> ");
        reverseString(n, sb, i);
        sc.close();

    }

    // Recursion Approach //
    public static void reverseString(String n, StringBuilder sb, int i) {
        if (i < 0) {
            return;
        }
        System.out.print(sb.charAt(i));
        reverseString(n, sb, i - 1);
    }

}
