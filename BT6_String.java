package BTVN;

import java.util.Scanner;

public class BT6_String {
    //    public static void main(String[] args) {
//        String a = "2 34.5 -12.9 0 12 1.98 8";
//        int ok = 1, cnt = 0;
//        for (int i = 0; i < a.length(); i++) {
//            if((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')){
//                ok = 0;
//                System.out.println("false");
//                break;
//            }
//        }
//        if(ok == 1){
//            System.out.println("true");
//            String [] s = a.split(" ");
//            System.out.println("Co " + s.length + " so");
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s_input = sc.nextLine();
        String [] s_list = s_input.split(" ");
        for(String s_tmp : s_list){
            try {
                Double.parseDouble(s_tmp);
            }catch(NumberFormatException a){
                System.out.println(a.toString());
                sc.close();
                return;
            }
        }
        System.out.println("Dung roi: " + s_list.length);
    }
}
