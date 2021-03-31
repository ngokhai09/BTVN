package BTVN.TryCatch;

import java.util.Scanner;

public class NumberArrayCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] check = a.split(" ");
        int ok = 1;
        for(String i : check){
           try{
               double n = Double.parseDouble(i);
           } catch (NumberFormatException e){
               ok = 0;
           }
           if(ok == 0){
               System.out.println("false");
               return ;
           }
        }
        System.out.println("true. Co " + check.length + " so");
    }
}
