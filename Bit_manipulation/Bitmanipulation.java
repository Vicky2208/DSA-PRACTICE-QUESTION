package Bit_manipulation;

import java.util.*;

public class Bitmanipulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer number");
        int a = sc.nextInt();
        String sb = decToBinary(a);
        showBinary(a);

        boolean caseNumber = false;

        do {

            System.out.println(
                    "             <-- Please Choose Which of the following function You want to do with this binary number -->        \n\n");
            System.out.println(
                    " 1.  Get-Bit Method :\t  2.  Set-Bit Method :\t 3.  Clear-Bit Method :\t 4.  Change a Number : \t 5.  Update a Bit : \t 6.  Exit :\t");

            System.out.println(" \n Please Enter Your Choice ");
            int option = sc.nextInt();

            if (option == 4) {
                System.out.println("Enter New Number");
                int b = sc.nextInt();
                a = b;
            }

            switch (option) {
                case 1:
                    getBit(a, sc);
                    break;

                case 2:

                    int set = setBit(a, sc);
                    System.out.println("The Number After changing 0 to 1 is: -> " + decToBinary(set)
                            + " and in Decimal :-> " + set);
                    break;

                case 3:
                    int clear = clearBit(a, sc);
                    System.out.println("The Number After Clearing that position is : -> " + decToBinary(clear)
                            + " and in Decimal :-> " + clear);
                    break;

                case 4:
                    showBinary(a);
                    break;

                case 5:
                    int update = updateBit(a, sc);
                    System.out.println("The Number after Update given position is :-> " + decToBinary(update)
                            + " In decimal :->> " + update);

                case 6:
                    System.exit(0);
                    caseNumber = true;
                    break;

                default:
                    System.out.println("Please Choose a Valid Given Chooice");
                    break;
            }
        } while (!caseNumber);
        // System.out.println("Enter The Position ");
        // int b = sc.nextInt(); // its a position where we get value start from right
        // side

        // getBit(a, b);
        // System.out.print("The New Number is ");
        // int c = setBit(a, b);
        // System.out.println(decToBinary(c, sb));

        // int d = clearBit(a, b);
        // System.out.println("The value After deleting the given position vale is :-> "
        // + d
        // + " and its binary form is :-> " + decToBinary(d, sb));

    }

    /* Understanding of GetBit Method in bitManipulation */
    // to get any bit from given position in a given number
    // AND operation
    // BitMask << pos

    public static void getBit(int a, Scanner sc) {

        System.out.println("Enter The Position of the number You want to know is Zero or One ");
        int position = sc.nextInt(); // its a position where we get value start from right side

        int Bitmask = 1 << position;

        if ((Bitmask & a) == 0) {
            System.out.println(" Bit Was Zero ");
        } else {
            System.out.println(" Bit Was One ");
        }
    }

    // Method to Set any bit from given position in a given number i.e(a)
    // OR operation
    // BitMask << pos

    public static int setBit(int a, Scanner sc) {
        System.out.println(
                "Enter The Position of the number You want to Set value as 1 (Remember:->only set 0,s value to 1) \n");
        int position = sc.nextInt();

        int Bitmask = 1 << position;
        int newNumber = Bitmask | a;
        return newNumber;
    }

    /* --Clear Method */ // clear means 0 kerna at particular position
    // BIT MASK : - 1 << position
    // OPERATION : - AND with NOT

    public static int clearBit(int a, Scanner sc) {
        System.out.println("Enter The Position of the number You want to Clear(Means set to 0) \n");
        int position = sc.nextInt();

        int Bitmask = 1 << position;
        int newBitmask = ~(Bitmask);
        return (newBitmask & a);

    }

    /* --Update Method */ // update means 0 kerna ho to
    // BIT MASK : - 1 << position
    // OPERATION For convert 0 ) : - AND
    // OPERATION For convert 1 ) : - OR with NOT

    public static int updateBit(int a, Scanner sc) {
        System.out.println("Enter The Position of the number You want to Update \n");
        int position = sc.nextInt();

        int Bitmask = 1 << position;
        System.out.println("Enter Whether you want to convert given number to 0 or 1");
        int choice = sc.nextInt();
        if (choice == 0) {
            int newBitmask = ~(Bitmask);
            return (newBitmask & a);
        }
        return (Bitmask | a);
    }

    /* Method to convert any decimal Number to Binary */

    public static String decToBinary(int a) {
        StringBuilder stb = new StringBuilder();
        int[] binary = new int[40];
        int dec = a;
        int index = 0;
        while (dec > 0) {
            binary[index] = dec % 2;
            dec = dec / 2;
            index++;
        }
        for (int i = index - 1; i >= 0; i--) {
            stb.append(binary[i]);
        }
        return stb.toString();

    }

    public static String showBinary(int a) {

        String binaryNumber = decToBinary(a);
        System.out.println("The Given Numnber in Binary form is : " + binaryNumber + "\n\n");
        return binaryNumber;
    }

}
