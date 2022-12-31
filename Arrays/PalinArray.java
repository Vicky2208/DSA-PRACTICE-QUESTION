package Arrays;

public class PalinArray {

    public static void main(String args[]) {
        int a[] = { 222, 333, 555, 777 };
        int n = a.length;
        palinArray(a, n);
    }

    public static void palinArray(int[] a, int n) {
        // add code here.
        for (int i = 0; i < n; i++) {
            int temp = a[i];
            int rev = 0;
            int r;
            int count = 0;
            while (temp != 0) {
                r = temp % 10;
                rev = (rev * 10) + r;
                temp = temp / 10;
            }
            if (rev == a[i]) {
                count++;
            } else {
                System.out.println(0);
            }
            if (count == n) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
