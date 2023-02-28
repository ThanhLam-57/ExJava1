package Oop;

public class HinhVuong extends HinhChuNhat {
    private double canh =1;

    public HinhVuong(double canh) {
        super(canh, canh);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }
    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public void setChieuRong(double canh) {
        super.setChieuRong(canh);
    }

    @Override
    public void setChieuDai(double canh) {
        super.setChieuDai(canh);
    }
}
