package BTVN.Hinh;

public class Circle implements Shape {
    private double x;
    private double y;
    private double R;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        R = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", R=" + R +
                '}';
    }

    @Override
    public double area() {
        return Math.PI * this.R * this.R;
    }

    @Override
    public double perimeter() {
        return Math.PI * this.R * 2.0;
    }

    @Override
    public double distance() {
        return 0;
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void rotate(double goc) {

    }

    @Override
    public void zoom(double ratio) {
        this.R *= ratio;
        this.area();
        this.perimeter();
    }
}
