package BTVN.Point;

public class Point3D extends Point2D {
    private double z;
    protected final int type = 3;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getType() {
        return type;
    }

    public void move(double dx, double dy, double dz) {
        super.move(dx,dy);
        z += dz;

    }

    public Point2D dx(){
        return new Point3D(-getX(), -getY(), -z);
    }
    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }

    public double kc(Point3D point) {
        return Math.sqrt(Math.pow(getX() - point.getX(), 2) + Math.pow(getY() - point.getY(), 2) + Math.pow(getZ() - point.getZ(), 2));
    }
}
