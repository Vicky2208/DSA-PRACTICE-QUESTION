package Recursion;

import java.util.Scanner;

//  A program that print All Keypad Combinations Of Nokia old Phone
//  Time Complexity = O(4^n);
public class KeypadCombination {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String ");
        String n = sc.nextLine();
        StringBuilder sb = new StringBuilder(n);
        int idx = 0;
        String combination = "";

        keypadCombination(sb, idx, combination);
        sc.close();

    }

    // Recursion Approach

    public static void keypadCombination(StringBuilder sb, int idx, String combination) {

        if (idx == sb.length()) {
            System.out.println(combination);
            return;
        }

        String mapping = keypad[sb.charAt(idx) - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            keypadCombination(sb, idx + 1, combination + mapping.charAt(i));
        }

    }

}
