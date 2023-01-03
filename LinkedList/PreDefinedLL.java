package LinkedList;

import java.util.*;

public class PreDefinedLL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<Integer>();
        Collections.addAll(list, 1, 5, 7, 3, 8, 2, 77, 33, 70, 64, 72, 22, 88, 11, 19, 40, 556, 76);
        System.out.println("Enter The element you want to find in this above list");
        int n = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n)
                System.out.println("Elememnt Found At index No:-> " + i);
            if (list.get(i) > 25)
                list.remove(i);
        }
        System.out.println("The element that are greater than 25 are deleted \n The final list are here :-> " + list);

    }

}
