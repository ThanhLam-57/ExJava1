package Oop.Ex3;

public class TapChi extends TaiLieu{
    private String soPhatHanh ;

    public TapChi(String maTaiLieu, String nhaXB, int soBanPhatHanh, String soPhatHanh) {
        super(maTaiLieu, nhaXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    @Override
    public String toString() {
        return "tapChi{" + super.toString()+
                "soPhatHanh='" + soPhatHanh + '\'' +
                '}';
    }
}
