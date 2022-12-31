package Recursion;

import java.util.Scanner;
//  Check  if an array is soretd or not using recursion

public class CheckArraySort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The Size of Array ");
        // String n = sc.nextLine();
        int arr[] = { 222, 1, 666, 777 };
        int n = arr.length - 1;
        int idx = 0;
        // System.out.println(Enter The)
        checkArraySort(arr, n, idx);
        sc.close();

    }

    // Recursion Approach //
    public static void checkArraySort(int[] arr, int n, int idx) {
        if (idx == n) {
            System.out.println("The array is in Sorted Order");
            return;
        }
        if (arr[idx] <= arr[idx + 1]) {
            checkArraySort(arr, n, idx + 1);
        } else {
            System.out.println("The array is not in Sorted Order");
            return;
        }
    }

}
