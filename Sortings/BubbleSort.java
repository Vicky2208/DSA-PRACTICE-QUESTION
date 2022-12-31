package Sortings;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No of Elememnts");
        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println(" \n Enter " + i + " Element\n");
            array[i] = sc.nextInt();
        }

        System.out.println("\n Element Before Sorting :--> \n");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        bubbleSort(array);

        System.out.println("\n \n Element After Sorting :--> \n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    array[j + 1] = array[j] + array[j + 1];
                    array[j] = array[j + 1] - array[j];
                    array[j + 1] = array[j + 1] - array[j];
                }
            }

        }

    }

}
