package Advance_Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Print All the subsets of a set of first n natural numbers 

public class SubsetOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] subsets = new int[] { 1, 2, 3 };

        System.out.println(IterativeApproach(subsets));
        System.out.println(
                "The Total Number of subsets can be formed of 123 " + " numbers set is " + FindSubsets(subsets));

        sc.close();

    }

    // Recursion Approach //

    public static List<List<Integer>> FindSubsets(int[] Set) {

        List<List<Integer>> result = new ArrayList<>(); // power set it store all the result of final values
        generateSubsets(0, Set, new ArrayList<>(), result);
        return result; // adding empty Set :-> []

    }

    public static void generateSubsets(int idx, int[] Set, List<Integer> curr,
            List<List<Integer>> result) {
        result.add(new ArrayList<>(curr)); // []

        for (int i = idx; i < Set.length; i++) {
            // Add Subsets
            curr.add(Set[i]); // [1]
            generateSubsets(idx + 1, Set, curr, result);

            // Remove SubSets
            curr.remove(curr.size() - 1); // []

        }
    }

    // Iterative Approach

    public static List<List<Integer>> IterativeApproach(int[] Set) {

        List<List<Integer>> result = new ArrayList<>(); // power set it store all the result of final values
        result.add(new ArrayList<>()); // adding empty Set :-> []123

        for (int i : Set) {
            int n = result.size();

            for (int j = 0; j < n; j++) {

                ArrayList<Integer> temp = new ArrayList<>(result.get(j));
                temp.add(i);
                result.add(temp);

            }

        }
        return result;

    }

}
