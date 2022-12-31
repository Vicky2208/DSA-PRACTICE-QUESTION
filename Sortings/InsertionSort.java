package Sortings;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The No of Elememnts");
        // int n = sc.nextInt();
        int array[] = new int[] { 22, 5, 3, 8, 8, 6, 11 };

        // for (int i = 0; i < array.length; i++) {
        // System.out.println(" \n Enter " + (i + 1) + " Element\n");
        // array[i] = sc.nextInt();
        // }

        System.out.println("\n Element Before Sorting :--> \n");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        insertionSort(array);

        System.out.println("\n \n Element After Sorting :--> \n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int sorted = array[i];
            int j = i - 1;
            while (j >= 0 && sorted < array[j]) {
                array[j + 1] = array[j];
                j--;

            }
            array[j + 1] = sorted;

        }

    }

}
