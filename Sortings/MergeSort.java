package Sortings;

import java.util.Scanner;

public class MergeSort {

    // Recursive Approach

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The No of Elememnts");
        // int n = sc.nextInt();
        int array[] = new int[] { 9, 3, 3, 5, 2, 8, 9, 6, 1 };
        int strtIdx = 0;
        int endIdx = array.length - 1;

        System.out.println("\n Element Before Sorting :--> \n");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        mergeSort(array, strtIdx, endIdx);

        System.out.println("\n \n Element After Sorting :--> \n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }

    public static void mergeSort(int[] array, int start, int end) {

        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;

        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);

        Conquer(array, start, mid, end);

    }

    public static void Conquer(int[] array, int start, int mid, int end) {

        int[] merged = new int[(end - start) + 1];

        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (array[idx1] >= array[idx2]) {
                merged[x] = array[idx2];
                idx2++;
            } else {
                merged[x] = array[idx1];
                idx1++;
            }
            x++;
        }

        while (idx1 <= mid) {
            merged[x++] = array[idx1++];
        }
        while (idx2 <= end) {
            merged[x++] = array[idx2++];
        }

        for (int i = 0, j = start; i < merged.length; i++, j++) {
            array[j] = merged[i];
        }

    }

}
