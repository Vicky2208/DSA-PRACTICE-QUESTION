package Strings;

import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any String");
        String str = sc.nextLine();

        System.out.println("Enter Second String");
        String str2 = sc.nextLine();

        StringBuilder s1 = new StringBuilder(str);
        StringBuilder s2 = new StringBuilder(str2);

        checkPalindrome(s1, s2);
        sc.close();

    }

    public static void checkPalindrome(StringBuilder a, StringBuilder b) {

        boolean t = true;
        for (int i = 0; i < a.length(); i++) {
            if (a.length() == b.length() && a.charAt(i) == b.charAt(i)) {
                t = true;
            } else {
                t = false;
            }
        }
        if (t == true) {
            System.out.println("String is Same");
        } else {
            System.out.println("String is not Same");
        }
    }
}
