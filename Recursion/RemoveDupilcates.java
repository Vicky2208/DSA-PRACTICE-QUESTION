package Recursion;

import java.util.Scanner;
// Remove Duplicates From the string 

public class RemoveDupilcates {
    public static boolean[] map = new boolean[26];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String ");
        String n = sc.nextLine();
        StringBuilder sb = new StringBuilder(n);
        int idx = 0;
        StringBuilder newString = new StringBuilder();
        removeDuplicateStr(sb, newString, idx);
        sc.close();

    }

    // Recursion Approach //
    public static void removeDuplicateStr(StringBuilder sb, StringBuilder newString, int idx) {

        if (idx == sb.length()) {
            System.err.println("After Removing Duplicate Character We get this :->> " + newString);
            return;
        }
        char curr_char = sb.charAt(idx);
        if (map[curr_char - 'a'] == true) {
            removeDuplicateStr(sb, newString, idx + 1);
        } else {
            newString.append(curr_char);
            map[curr_char - 'a'] = true;
            removeDuplicateStr(sb, newString, idx + 1);
        }
    }

}
