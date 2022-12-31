package Recursion;

import java.util.Scanner;
// Move All Given Character To end Of the string 
// it create a new String to full fill above condition

public class MoveToEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String ");
        String n = sc.nextLine();
        StringBuilder sb = new StringBuilder(n);
        int idx = 0, count = 0;
        StringBuilder newString = new StringBuilder(sb.length() - 1);
        System.out.println("Enter The Character From the String You want to set to its end");
        char s = sc.next().charAt(0);
        moveToEnd(s, sb, newString, idx, count);
        sc.close();

    }

    // Recursion Approach //
    public static void moveToEnd(char s, StringBuilder sb, StringBuilder newString, int idx, int count) {
        if (idx == sb.length()) {
            while (count > 0) {
                newString.append(s);
                count--;
            }
            System.out.println("The Final String After Moving " + s + " is :->>" + newString);
            return;
        }
        if (sb.charAt(idx) == s) {
            count++;
            moveToEnd(s, sb, newString, idx + 1, count);
        } else {
            newString.append(sb.charAt(idx));
            moveToEnd(s, sb, newString, idx + 1, count);
        }
    }

}
