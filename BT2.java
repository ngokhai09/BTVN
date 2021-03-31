package BTVN;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Gia tri phan tu thu n la: " + b);
        a = b = 1;
        c = 0;
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Phan tu gan " + n + " nhat la: " + ((n - a < b - n) ? a:b));
    }
}
