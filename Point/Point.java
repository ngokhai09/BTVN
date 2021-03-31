package BTVN.Point;

import java.util.ArrayList;

public class Point {
    public static void main(String[] args) {
        ArrayList<Point2D> list = new ArrayList<Point2D>();
        Point3D point = new Point3D(1, 2, 3);
        Point3D point1 = new Point3D(-3, -4, -5);
        list.add(point);
        list.add(point1);
        Point2D point2D = new Point2D(3.0, 4.0);
        Point2D point2D1 = new Point2D(-6.0, -7.0);
        list.add(point2D);
        list.add(point2D1);
        // Tính khoảng cách
        double Sum2D = 0, Sum3D = 0;
        for(Point2D p : list){
            if(p instanceof Point3D){

            }
        }
        // Tinh tien diem
        for (Point2D p : list) {
            if(p instanceof Point3D){
                p.move(2.0, 3.0);
            }
            else {
                p.move(2.0, 3.0);
            }
        }

        // Điểm đối xứng
        int n = list.size();
        for (int i = 0; i < n; i++) {
            list.add(list.get(i).dx());
        }
        System.out.println("Danh sach diem: ");
        for (Point2D p : list) {
            System.out.println(p.toString());
        }

    }

}

