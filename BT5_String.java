package BTVN;

public class BT5_String {
    public static void main(String[] args) {
        String a = "Lap trinh Java khong don gian";
        for(int i = a.length() - 1; i >= 0; i--)
            if(a.charAt(i) != 'a')
                System.out.print(a.charAt(i));
    }
}
