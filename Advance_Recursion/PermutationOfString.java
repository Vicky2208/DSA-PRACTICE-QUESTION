package Advance_Recursion;

import java.util.Scanner;

// A Program that Print All the Permutations of A String 

public class PermutationOfString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String ");
        String n = sc.nextLine();
        String combination = "";
        permutationOfString(n, combination);
        sc.close();

    }

    // Recursion Approach //
    public static void permutationOfString(String n, String combination) {

        if (n.length() == 0) {
            System.out.println(combination);
            return;
        }
        for (int i = 0; i < n.length(); i++) {

            char currChar = n.charAt(i);
            String str = n.substring(0, i) + n.substring(i + 1);
            permutationOfString(str, combination + currChar);
        }

    }

}
