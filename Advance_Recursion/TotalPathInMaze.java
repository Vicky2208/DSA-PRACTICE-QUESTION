package Advance_Recursion;

import java.util.Scanner;
// Count Total Paths in a maze to  move from (0,0) to (n,m);

public class TotalPathInMaze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The position  of i and j to reach");
        int row = sc.nextInt();
        int column = sc.nextInt();
        System.out.println("The total no of paths to get " + row + " and " + column + " Position is :->> "
                + totalPathinMaze(0, 0, row, column));
        sc.close();

    }

    // Recursion Approach //
    public static int totalPathinMaze(int i, int j, int row, int column) {

        if (i == row - 1 && j == column - 1) {
            return 1;
        }
        if (i == row || j == column) {
            return 0;

        }
        int downPath = totalPathinMaze(i + 1, j, row, column);
        int rightPath = totalPathinMaze(i, j + 1, row, column);
        return downPath + rightPath;

    }

}
