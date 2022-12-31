package Advance_Recursion;

import java.util.Scanner;

// A program that finds no of ways to Place Tiles of size 1Xm in a floor of size mXn
// row = m  && column = n

public class PlaceTiles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The position  of i and j to reach");
        int row = sc.nextInt();
        int column = sc.nextInt();
        System.out.println("The total no of paths to get " + row + " and " + column + " Position is :->> "
                + placeTiles(row, column));
        sc.close();

    }

    // Recursion Approach //
    public static int placeTiles(int row, int column) {
        if (row == column) {
            return 2;
        }
        if (row < column) {
            return 1;
        }
        // For Vertical\
        int verticalPlaces = placeTiles(row - column, column);

        // For Horizontal
        int horizontalPlaces = placeTiles(row - 1, column);

        return verticalPlaces + horizontalPlaces;

    }

}
