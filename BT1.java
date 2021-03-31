package BTVN;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        double a, b, c, x1, x2;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) System.out.println("vo so nghiem");
                else System.out.println("vo nghiem");
            }
            else {
                double x = -c / b;
                System.out.printf("%.3f", x);

            }
        }
        else {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                x1 = (-b - Math.sqrt(d)) / (2 * a);
                x2 = (-b + Math.sqrt(d)) / (2 * a);
                if (x1 < x2) System.out.printf("%.3f\n%.3f", x1, x2);
                else System.out.printf("%.3f\n%.3f", x2, x1);
            }
            else if (d == 0) {
                System.out.printf("%.3f", -b / (2 * a));
            }
            else System.out.println("vo nghiem");

        }
    }
}
