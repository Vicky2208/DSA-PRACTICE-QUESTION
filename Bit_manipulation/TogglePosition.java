package Bit_manipulation;

import java.util.Scanner;
import Bit_manipulation.Bitmanipulation.*;

// Write a program to toggle a bit a position = "pos" in a number n;

public class TogglePosition {

    public static void main(String[] args) {

        Bitmanipulation B = new Bitmanipulation();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int bitmask;
        B.showBinary(a);

        System.out.println("Enter the position u want to change");
        int pos = sc.nextInt();
        System.out.println("Enter Whether you want change it to 1 or 0");
        int num = sc.nextInt();
        bitmask = 1 << pos;

        if (num == 0) {
            int newBitmask = ~(bitmask);
            int newNumber1 = newBitmask & a;
            B.showBinary(newNumber1);
            System.out.println(" In decimal :->>  " + newNumber1);
        } else {
            int newNumber2 = bitmask | a;
            B.showBinary(newNumber2);
            System.out.println(" In decimal :->>  " + newNumber2);
        }

    }

}
