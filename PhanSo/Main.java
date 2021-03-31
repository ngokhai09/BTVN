package BTVN.PhanSo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Phanso> list = new ArrayList<Phanso>();
        Phanso ob = new Phanso(1,2);
        list.add(ob);
        ob = new Phanso(2,2);
        list.add(ob);
        ob = new Phanso(4,2);
        list.add(ob);
        Phanso max = list.get(0);
        for(Phanso ps : list){
            if(max.sosanh(ps) == 1){
                max = ps;
            }
        }
        System.out.println("Phan so max: " + max.toString());
        Phanso sum = list.get(0);
        for(int i = 1; i < list.size(); i++){
            sum = sum.cong(list.get(i));
        }
        System.out.println("Phan so tong: " + sum.toString());
        System.out.println("Phan so kp so nguyen");
        for (Phanso ps: list){
            if(ps.getTuso()%ps.getMauso()!=0){
                System.out.println(ps.toString());
            }
        }
    }
}
