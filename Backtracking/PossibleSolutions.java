package Backtracking;

import java.util.Scanner;

public class PossibleSolutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String ");
        String str = sc.nextLine();
        String Permutation = "";
        PermutationOfString(str, Permutation);

        sc.close();

    }

    // Recursion Approach

    public static void PermutationOfString(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println("All permutation of given Sring are :->>" + permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            String newStr = str.substring(0, i) + str.substring(i + 1);
            PermutationOfString(newStr, permutation + str.charAt(i));

        }

    }

}
