package Oop.HinhHoc;

public class HinhChuNhat implements HinhHocInterface{
    private double chieuDai = 0;
    private double chieuRong = 0;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public double chuVi() {
        return (chieuDai+chieuRong)*2;
    }

    @Override
    public double dienTich() {
        return chieuRong*chieuDai;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong + "dien tich"+dienTich()+"chu vi "+ chuVi() +
                '}';
    }
}
