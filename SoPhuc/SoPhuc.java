package BTVN.SoPhuc;

public class SoPhuc {
    private double thuc;
    private double ao;

    public SoPhuc() {
        this.thuc = 1.0;
        this.ao = -1.0;
    }

    public SoPhuc(double thuc, double ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public double getThuc() {
        return thuc;
    }

    public void setThuc(double thuc) {
        this.thuc = thuc;
    }

    public double getAo() {
        return ao;
    }

    public void setAo(double ao) {
        this.ao = ao;
    }

    public double Modulus() {
        return Math.sqrt(Math.pow(thuc, 2) + Math.pow(ao, 2));
    }

    public SoPhuc sum(SoPhuc a) {
        SoPhuc z = new SoPhuc();
        z.thuc = this.thuc + a.thuc;
        z.ao = this.ao + a.ao;
        return z;
    }

    public SoPhuc div1Num(int num) {
        SoPhuc z = new SoPhuc();
        z.thuc = this.thuc / num;
        z.ao = this.ao / num;
        return z;
    }

    @Override
    public String toString() {
        if (ao > 0) return thuc + " + " + ao + "i";
        else if (ao == 0) return "" + thuc;
        return thuc + " - " + (-ao) + "i";
    }
}
