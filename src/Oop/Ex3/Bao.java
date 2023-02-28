package Oop.Ex3;

import java.util.Date;

public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao(String maTaiLieu, String nhaXB, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, nhaXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" + super.toString()+
                "ngayPhatHanh=" + ngayPhatHanh +
                '}';
    }
}
