package BTVN.Hinh;

public class Triangle implements Shape{
    private Line l1;
    private Line l2;
    private Line l3;

    public Triangle(Line l1, Line l2, Line l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public Line getL1() {
        return l1;
    }

    public void setL1(Line l1) {
        this.l1 = l1;
    }

    public Line getL2() {
        return l2;
    }

    public void setL2(Line l2) {
        this.l2 = l2;
    }

    public Line getL3() {
        return l3;
    }

    public void setL3(Line l3) {
        this.l3 = l3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                '}';
    }

    @Override
    public double area() {
        return Math.sqrt((l1.distance() + l2.distance() + l3.distance())/3* ((l1.distance() + l2.distance() + l3.distance())/3 - l1.distance())*((l1.distance() + l2.distance() + l3.distance())/3 -l2.distance())*((l1.distance() + l2.distance() + l3.distance())/3 - l3.distance()));
    }

    @Override
    public double perimeter() {
        return (l1.distance() + l2.distance() + l3.distance());
    }

    @Override
    public double distance() {
        return 0;
    }

    @Override
    public void move(double dx, double dy) {
        l1.getP1().move(dx, dy);
        l1.getP2().move(dx, dy);
        l2.getP1().move(dx, dy);
        l2.getP2().move(dx, dy);
        l3.getP1().move(dx, dy);
        l3.getP2().move(dx, dy);
    }

    @Override
    public void rotate(double goc) {

    }

    @Override
    public void zoom(double ratio) {

    }
}
