package BTVN.TryCatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class IntegerCheck {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            a.add(rand.nextInt(100));
        }
        int ok = 0;
        while (ok != 1){
            try {
                int n = Integer.parseInt(sc.nextLine());
                System.out.println(a.get(n));
                ok = 1;
            } catch (NumberFormatException e){
                System.out.println("Ban phai nhap so nguyen");
            } catch (IndexOutOfBoundsException e){
                System.out.println("Ban da nhap qua gia tri cua mang");
            }
        }


    }
}
