package BTVN.SoPhuc;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SoPhuc> list = new ArrayList<>();
        SoPhuc sp1 = new SoPhuc(2.0, 3.0);
        SoPhuc sp2 = new SoPhuc(-6.0, 3.0);
        SoPhuc sp3 = new SoPhuc(2.0, -9.0);
        SoPhuc sp4 = new SoPhuc();
        SoPhuc sp5 = new SoPhuc(7.0, -2.0);
        list.add(sp1);
        list.add(sp2);
        list.add(sp3);
        list.add(sp4);
        list.add(sp5);
        //In danh sach
        System.out.println("Danh sach so phuc: ");
        for (SoPhuc i : list) {
            System.out.println(i.toString());
        }
        //TBC so phuc
        SoPhuc sp = new SoPhuc(0.0, 0.0);
        System.out.println(sp.toString());
        System.out.println();
        if (list.size() != 0) {
            for (SoPhuc i : list) {
                sp = sp.sum(i);
            }
            System.out.println("TBC cac so phuc la: " + sp.div1Num(list.size()));
        } else {
            System.out.println("Danh sach rong");
        }
        //Tim sp cos modulus max
        double max = 0;
        for (SoPhuc i : list) {
            if (i.Modulus() > max) {
                max = i.Modulus();
                sp = i;
            }
        }
        System.out.println("So phuc co Modulus lon nhat la: " + sp.toString());
        // Dem
        int cnt = 0;
        for (SoPhuc i : list) {
            if (i.getAo() == 0) {
                cnt++;
            }
        }
        if (cnt != 0) {
            System.out.println("So luong so phuc ko co phan ao la: " + cnt);
        } else {
            System.out.println("Tat ca cac so deu co phan ao");
        }

    }
}
