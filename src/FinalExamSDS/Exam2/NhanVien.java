package FinalExamSDS.Exam2;

public abstract class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String namSinh;
    private String diaChi;

    public  NhanVien(){}
    public NhanVien(String maNhanVien, String tenNhanVien, String namSinh, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public abstract String moTaCongviec();

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", tenNhanVien='" + tenNhanVien + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
