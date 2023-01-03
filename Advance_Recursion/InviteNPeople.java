package Advance_Recursion;

import java.util.Scanner;
// Write A Program to find The number of Ways in Which you can invite n People to Your Party, Single Or in Pairs

public class InviteNPeople {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No of People in Party");
        int n = sc.nextInt();
        System.out.println("The total no of Ways to Participate  " + n + " Guests in single or in pairs is "
                + CallGuest(n));
        sc.close();

    }

    // Recursion Approach //
    public static int CallGuest(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        if (n <= 1) {
            return 1;
        }
        // Way 1
        int Way1 = CallGuest(n - 1);
        // Way 2
        int Way2 = (n - 1) * CallGuest(n - 2);

        return Way1 + Way2;

    }

}
