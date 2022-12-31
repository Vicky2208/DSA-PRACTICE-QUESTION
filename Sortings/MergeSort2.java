package Sortings;

import java.util.Scanner;

// Iterative Approach for MergeSort still not working!!!!!!!!!!!!!

public class MergeSort2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The No of Elememnts");
        // int n = sc.nextInt();
        int array[] = new int[] { 9, 3, 3, 5, 2, 8, 9, 6, 1 };
        int h = array.length - 1;

        System.out.println("\n Element Before Sorting :--> \n");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        mergeSort(array, h);

        System.out.println("\n \n Element After Sorting :--> \n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }

    public static void mergeSort(int[] array, int end) {

        int p, l, h, mid, i;

        for (p = 2; p <= end; p = 2 * p) {

            for (i = 0; i + p - 1 <= end; i = i + p) {

                l = i;
                h = i + p - 1;
                mid = (l + h) / 2;
                merge(array, l, mid, h);
            }

        }
        if (p / 2 <= end) {
            merge(array, 0, p / 2, end);
        }

    }

    public static void merge(int[] array, int l, int mid, int h) {

        int i = l, j = h, k = 0;
        int[] tempArr = new int[100];
        while (i <= mid && j <= h) {
            if (array[i] < array[j]) {
                tempArr[k++] = array[i++];
            } else {
                tempArr[k++] = array[j++];
            }
        }

        while (i <= mid) {
            tempArr[k++] = array[i++];
        }
        while (j <= h) {
            tempArr[k++] = array[j++];
        }

        for (; i <= h; i++) {
            array[i] = tempArr[i];
        }
    }

}
