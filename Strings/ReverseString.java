package Strings;

import java.util.*;
// Reverse a string Without using Extra Space 

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length() / 2; i++) {
            char front = sb.charAt(i);
            char last = sb.charAt(sb.length() - 1 - i);
            sb.setCharAt(sb.length() - 1 - i, front);
            sb.setCharAt(i, last);

        }
        System.out.println(sb);
        sc.close();
    }

}
