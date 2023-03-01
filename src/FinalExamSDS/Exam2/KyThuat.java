package FinalExamSDS.Exam2;

public class KyThuat extends NhanVien{
    private String chuyenNganh;

    public KyThuat(){}
    public KyThuat(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public KyThuat(String maNhanVien, String tenNhanVien, String namSinh, String diaChi, String chuyenNganh) {
        super(maNhanVien, tenNhanVien, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "KyThuat{" + super.toString() +
                "chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }

    @Override
    public String moTaCongviec() {
        return toString();
    }
}
