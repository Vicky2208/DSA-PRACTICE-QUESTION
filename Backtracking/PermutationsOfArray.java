package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

// Example 1:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

public class PermutationsOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of an Array ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter The Elements of an Array ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> finalList = new ArrayList<>();
        System.out.println(permute(nums, new ArrayList<>(), finalList));

        sc.close();

    }

    // Recursion Approach

    public static List<List<Integer>> permute(int[] nums, List<Integer> tempList, List<List<Integer>> finalList) {

        if (tempList.size() == nums.length) {
            finalList.add(new ArrayList<>(tempList));
        }

        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i]) != true) {
                tempList.add(nums[i]);
                permute(nums, tempList, finalList);
                tempList.remove(tempList.size() - 1);
            }
        }
        return finalList;
    }

}
