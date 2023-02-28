package Oop;

public class HinhChuNhat {
    private double chieuRong =1;
    private double chieuDai =1;

    public HinhChuNhat(double chieuRong, double chieuDai) {
        if (chieuRong > 0 && chieuDai >0) {
            this.chieuRong = chieuRong;
            this.chieuDai = chieuDai;
        }
    }
    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong > 0) {
            this.chieuRong = chieuRong;
        }
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    public double tinhChuVi(){
        return (chieuDai+chieuRong)*2;
    }
    public double tinhDienTich(){
        return chieuRong*chieuRong;
    }

}
