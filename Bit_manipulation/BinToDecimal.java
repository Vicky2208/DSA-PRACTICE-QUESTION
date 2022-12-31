package Bit_manipulation;

import java.util.Scanner;

public class BinToDecimal {

    public static void main(String[] args) {

        Bitmanipulation B = new Bitmanipulation();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Binary Number");
        String S = sc.nextLine();
        StringBuilder sb = new StringBuilder(S);
        int dec = 1;

        Method1(S, dec);
        Method2(S);

    }

    public static void Method1(String s, int dec) {

        for (int i = 0; i < s.length(); i++) {
            int j = s.length() - i - 1;
            // for (j = sb.length() - 1; j >= i; j--) {
            if (s.charAt(i) == '1') {
                dec += (Math.pow(2, j));
                j--;
            }
        }
        System.out.println("The number in Decimal Form is :->> By Method-1  " + (dec - 1));
    }

    // Method 2:- Predefined Method

    public static void Method2(String s) {
        int dec = Integer.parseInt(s, 2);
        System.out.println("The number in Decimal Form is :->> By Method-2  " + dec);
    }
}
