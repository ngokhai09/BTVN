package BTVN;

public class BT4_mang {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,2,4};
        int sum = 0, cnt1 = 0, cnt2 = 0, max = a[0];
        for (int i : a){
            if(i > 0 && i % 3 != 0){
                sum += i;
                cnt1++;
            }
            if(i >= -5 && i <= 10){
                cnt2++;
            }
            if(i > max && i % 5 == 0){
                max = i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(Math.abs(a[i]) > Math.abs(a[j])){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int c, i;
        for (c = i = 0; i < a.length; i++) {
            if (a[i] % 5 != 0 || a[i] % 3 == 0) {
                a[c] = a[i];
                c++;
            }
        }
    }
}
