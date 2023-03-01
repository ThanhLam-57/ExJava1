package Oop.HinhHoc;

public class HinhTron implements HinhHocInterface{
    private double banKinh = 0;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double chuVi() {
        return Math.PI*2*banKinh;
    }

    @Override
    public double dienTich() {
        return Math.PI*banKinh*banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh + "dien tich"+dienTich()+"chu vi "+ chuVi() +
                '}';
    }
}
