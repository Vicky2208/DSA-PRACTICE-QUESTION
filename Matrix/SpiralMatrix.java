package Matrix;

import java.util.Scanner;

public class SpiralMatrix {
  public static void main(String[] args) {
    int row, column;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter The  Rows of Matrtix");
    row = sc.nextInt();
    System.out.println("Enter The  Columns of Matrtix");
    column = sc.nextInt();
    int[][] matrix = new int[row][column];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.println("Enter " + i + " row ka " + j + " column");
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("The Given Matrix is :-");

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println("");
    }
    // transpose of matrix code

    /*
     * for (int i = 0; i < column; i++) {
     * for (int j = 0; j < row; j++) {
     * transpose[i][j] = matrix[j][i];
     * }
     * }
     */

    System.out.println("The matrix after Transpose is :->");

    for (int i = 0; i < column; i++) {
      for (int j = 0; j < row; j++) {
        System.out.print(matrix[j][i] + " ");
      }
      System.out.println("");
    }
    sc.close();
  }
}