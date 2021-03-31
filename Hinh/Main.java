package BTVN.Hinh;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shape = new ArrayList<>();
        Circle ci = new Circle(2.0, 3.0, 5.0);
        Line li = new Line(new Point(2.0, 3.0), new Point(4.0, 5.0));
        Triangle tri = new Triangle(new Line(new Point(3.0, 1.0), new Point(5.0, 1.0)), new Line(new Point(5.0, 7.0), new Point(6.0, 2.0)), new Line(new Point(8.0, 9.0), new Point(5.0, 6.0)));
        shape.add(ci);
        shape.add(li);
        shape.add(tri);
        double sumArea = 0, sumPerimeter = 0, minArea = shape.get(0).area(), minPerimeter = shape.get(0).perimeter();
        Shape area = shape.get(0);
        Shape perimeter = shape.get(0);

        for (Shape i : shape) {
            sumArea += i.area();
            sumPerimeter += i.perimeter();
            if(minArea > i.area()){
                minArea = i.area();
                area = i;
            }
            if(minPerimeter > i.perimeter()){
                minPerimeter = i.perimeter();
                perimeter = i;
            }
        }
        System.out.println("BTVN.Hinh co dien tich nho nhat: " + area);
        System.out.println("BTVN.Hinh co chu vi nho nhat: " + perimeter);


//        System.out.println("Nhap do phong: ");
        for (Shape i : shape) {
           i.zoom(2);
        }

    }
}
