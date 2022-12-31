package Bit_manipulation;

import java.util.*;

// Write a Program to count the number of 1,s in a binary representation of the number

public class CountOfOnes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Number");
        int a = sc.nextInt();

        System.out.println("The no of 1,s in the above Number is :->> " + countOfOne(a));

    }

    public static int countOfOne(int a) {

        Bitmanipulation B = new Bitmanipulation();
        String S = B.decToBinary(a);
        StringBuilder sb = new StringBuilder(S);
        B.showBinary(a);
        int count = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                count++;
            }
            System.out.println(sb.charAt(i));
        }
        return count;

    }

}
