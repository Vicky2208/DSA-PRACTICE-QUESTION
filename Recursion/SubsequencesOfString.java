package Recursion;

//  A Program To Print All the Subsequences Of A String 
// Hash Set
import java.util.HashSet;

// for ex->>  Subsequeces Of "abc" are-> a, ab, ac, b, bc, c 

import java.util.Scanner;

public class SubsequencesOfString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String ");
        String n = sc.nextLine();
        int idx = 0;
        String newString = "";
        subsequencesOfString(n, idx, newString);
        HashSet<String> set = new HashSet<>();
        System.out.println("Applying Unique method by using HashSet we Get :->> ");
        UniqueSubsequencesOfString(n, idx, newString, set);

        sc.close();

    }

    // Recursion Approach

    public static void subsequencesOfString(String n, int idx, String newString) {
        if (idx == n.length()) {
            System.err.println(newString);
            return;
        }
        // if to be
        subsequencesOfString(n, idx + 1, newString + (n.charAt(idx)));
        // if not to be
        subsequencesOfString(n, idx + 1, newString);

    }

    // Recursion Approach but Using HashSet for remove Duplicates of String
    // Hash Set is a Function That store Only Unique Element It Has Various
    // Functions :->> add, contains, clear, clone, isEmpty, iterator , Size.

    public static void UniqueSubsequencesOfString(String n, int idx, String newString, HashSet set) {
        if (idx == n.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.err.println(newString);
                set.add(newString);
                return;
            }
        }
        // if to be
        UniqueSubsequencesOfString(n, idx + 1, newString + (n.charAt(idx)), set);
        // if not to be
        UniqueSubsequencesOfString(n, idx + 1, newString, set);

    }

}
