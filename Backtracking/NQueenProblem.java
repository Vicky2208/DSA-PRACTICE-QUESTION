package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueenProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Board ");
        int n = sc.nextInt();
        System.out.println(solveNQueen(n));

        sc.close();

    }

    // Recursion Approach

    public static List<List<String>> solveNQueen(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] Board = new char[n][n];
        helper(allBoards, Board, 0);
        return allBoards;

    }

    public static void helper(List<List<String>> allBoards, char[][] Board, int col) {

        if (col == Board.length) {
            saveBoard(Board, allBoards);
            return;
        }

        for (int row = 0; row < Board.length; row++) {
            if (isSafe(row, col, Board)) {
                Board[row][col] = 'Q';
                helper(allBoards, Board, col + 1);
                Board[row][col] = '.';
            }
        }

    }

    // This is a function that checks all the queen direction that the perform in
    // chess to finding the right position]
    // of our "Q" char

    public static boolean isSafe(int row, int col, char[][] Board) {

        // Horizontal
        for (int j = 0; j < Board.length; j++) {
            if (Board[row][j] == 'Q') {
                return false;
            }
        }
        // Vertical
        for (int i = 0; i < Board[0].length; i++) {
            if (Board[i][col] == 'Q') {
                return false;
            }
        }
        // upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (Board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        // upper right
        for (int c = col; c < Board.length && r >= 0; r--, c++) {
            if (Board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        // lower left
        for (int c = col; c >= 0 && r < Board.length; r++, c--) {
            if (Board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        // Lower Right
        for (int c = col; c < Board.length && r < Board.length; r++, c++) {
            if (Board[r][c] == 'Q') {
                return false;
            }
        }
        return true;

    }

    // This is a function that save all the possible solutions in a allBoards
    // variable

    public static void saveBoard(char[][] Board, List<List<String>> allBoards) {

        String row = "";
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < Board.length; i++) {
            row = "";
            for (int j = 0; j < Board[i].length; j++) {
                if (Board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);

    }

}
