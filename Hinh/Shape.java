package BTVN.Hinh;

public interface Shape {
    public double area();
    public double perimeter();
    public double distance();
    public void move(double dx, double dy);
    public void rotate(double goc);
    public void zoom(double ratio);
}
