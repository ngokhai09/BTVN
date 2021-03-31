package BTVN.PhanSo;

public class Phanso {
    private int tuso;
    private int mauso;

    public Phanso() {
    }

    public Phanso(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Phanso{" +
                "tuso=" + tuso +
                ", mauso=" + mauso +
                '}';
    }

    public int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b,a % b);
    }

    public void rutgon() {
        int a = UCLN(getMauso(), getTuso());
        setTuso(getTuso() / a);
        setMauso(getMauso() / a);
    }

    public Phanso cong(Phanso a) {
        Phanso z = new Phanso();
        z.setTuso(getTuso() * a.getMauso() + getMauso() * a.getTuso());
        z.setMauso(getMauso() * a.getMauso());
        z.rutgon();
        return z;
    }
    public Phanso tru(Phanso a) {
        Phanso z = new Phanso();
        z.setTuso(getTuso() * a.getMauso() - getMauso() * a.getTuso());
        z.setMauso(getMauso() * a.getMauso());
        z.rutgon();
        return z;
    }
    public Phanso nhan(Phanso a) {
        Phanso z = new Phanso();
        z.setTuso(getTuso() * a.getTuso());
        z.setMauso(getMauso() * a.getMauso());
        z.rutgon();
        return z;
    }
    public Phanso chia(Phanso a) {
        Phanso z = new Phanso();
        z.setTuso(getTuso() * a.getMauso());
        z.setMauso(getMauso() * a.getTuso());
       z.rutgon();
       return z;
    }

    public int sosanh(Phanso a){
        if(this.tru(a).tuso > 0)
            return 1;
        else
            return 0;
    }

}
