package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Total Disks To Move ");
        int n = sc.nextInt();
        // System.out.println(Enter The)
        System.out.print("\n The Number of steps Up to " + n + "disk  is :->> \n");
        towerOfHanoi(n, "Source", "Destination", "Helper");
        double ans = Math.pow(2, n);
        System.out.println("\nTotal Steps is :->> " + (ans - 1));
        sc.close();

    }

    // Recursion Approach //
    public static void towerOfHanoi(int n, String S, String D, String H) {
        if (n <= 0) {
            return;

        } else {
            towerOfHanoi(n - 1, S, H, D);
            System.out.println("Disk " + n + " Move From " + S + " To " + D);
            towerOfHanoi(n - 1, H, D, S);

        }
    }

}
