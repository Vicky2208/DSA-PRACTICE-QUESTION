package Sortings;

import java.util.Scanner;

public class QuickSort {

    // Recursive Approach

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The No of Elememnts");
        // int n = sc.nextInt();
        int array[] = new int[] { 9, 3, 3, 5, 2, 8, 9, 6, 1 };
        int strtIdx = 0;
        int endIdx = array.length - 1;
        System.out.println("\n\n\n");

        System.out.println("\n Element Before Sorting :--> \n");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        quickSort(array, strtIdx, endIdx);

        System.out.println("\n \n Element After Sorting :--> \n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partitioning(array, start, end);

            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    public static int partitioning(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[end] = temp;
        return i;
    }
}