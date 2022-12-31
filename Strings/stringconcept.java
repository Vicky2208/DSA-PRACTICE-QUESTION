package Strings;

import java.util.*;

public class stringconcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@') {
                break;
            } else {
                System.out.print(str.charAt(i));
            }
        }
        sc.close();
    }

}
