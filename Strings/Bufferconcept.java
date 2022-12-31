package Strings;

import java.io.*;

public class Bufferconcept {

    public static void main(String[] args) throws IOException {

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of arrray");
        int size = Integer.parseInt(inp.readLine());

        int[] intArr = new int[size];

        System.out.println("Enter an list of numbers");
        for (int i = 0; i < size; i++) {
            intArr[i] = Integer.parseInt(inp.readLine());
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(i + " ith -> " + intArr[i]);
        }

    }
}
