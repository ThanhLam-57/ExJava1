package Oop.Ex3;

import java.util.Scanner;

public class Book extends TaiLieu{
    private String tenTacGia;
    private int soTrang;
    private int gia;


    public Book(String maTaiLieu, String nhaXB, int soBanPhatHanh, String tenTacGia, int soTrang, int gia) {
        super(maTaiLieu, nhaXB, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
        this.gia = gia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Book{" + super.toString()+
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", gia=" + gia +
                '}';
    }
}
