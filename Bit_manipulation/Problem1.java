package Bit_manipulation;

import java.util.Scanner;
import java.*;

/* Write a program to find if a number is a power of 2 or not ? */

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number we will tell U Whether it is power of 2 or not");
        int a = sc.nextInt();
        boolean b = true;
        System.out.println("which method u want to choose \n");
        System.out.println("1. Method -1(Normal Method) \t " + " 2. Method -2(Bit Operator Method)\t" + "3. Exit");
        int choice = sc.nextInt();

        if (choice <= 3) {

            switch (choice) {
                case 1:
                    Method1(a, b);
                    break;
                case 2:
                    Method2(a);
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } else {
            System.out.println("Please Choose a Valid Given Choice");
        }

    }

    /* First -- Method */
    public static void Method1(int a, Boolean b) {
        if (a == 0) {
            System.out.println("Number is not in power of 2");
        } else {
            while (a != 1) {
                if (a % 2 != 0) {
                    b = false;
                }
                a = a / 2;
            }
        }
        if (b) {
            System.out.println("Number is power of 2- (According to 1st Method)");
        } else {
            System.out.println("Number is not in power of 2 According to 1st Method)");

        }
    }

    /* Second-Method */ // By applying bit manipulation Concept
    public static void Method2(int a) {
        int val = a & (a - 1);
        if (val == 0) {
            System.out.println("Number is power of 2--According to 2nd Method)");
        } else {
            System.out.println("Number is not in power of 2--According to 2nd Method)");
        }
    }

}
