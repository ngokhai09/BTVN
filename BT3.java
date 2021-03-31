package BTVN;

import java.util.Scanner;

public class BT3 {
    public static int gt(int n){
        if(n == 1) return 1;
        return n*(n-1);
    }

    public static int sol(int n, int i){
        int res = 1;
        for(int j = 0; j < i; j++)
            res*=(n - j);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int sum = 1;
        for(int i = 1; i <= n; i++){
            sum += (Math.pow(x, i) * sol(n, i))/gt(i);
        }
        System.out.println(sum);
    }
}
