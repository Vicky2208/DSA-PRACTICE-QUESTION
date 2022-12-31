package Sortings;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No of Elememnts");
        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println(" \n Enter " + (i + 1) + " Element\n");
            array[i] = sc.nextInt();
        }

        System.out.println("\n Element Before Sorting :--> \n");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        selectionSort(array);

        System.out.println("\n \n Element After Sorting :--> \n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int first = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[first] > array[j]) {

                    first = j;
                }

            }
            // array[first] = array[first] + array[i];
            // array[i] = array[first] - array[i];
            // array[first] = array[first] - array[i];

            int temp = array[i];
            array[i] = array[first];
            array[first] = temp;

        }

    }

}
