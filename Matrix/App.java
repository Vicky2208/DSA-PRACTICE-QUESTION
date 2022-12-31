package Matrix;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int i, j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of row");
        int r = sc.nextInt();
        System.out.println("Enter The size of Column");
        int numb = 1;

        for (i = 0; i <= r; i++) {
            for (j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(numb + " ");
                numb = numb * (i - j) / (j + 1);
            }
            System.out.println();
            numb = 1;
        }
    }
}