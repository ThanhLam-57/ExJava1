package Oop.Ex3;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu;
    private String nhaXB;
    private int soBanPhatHanh = 50;

    public TaiLieu(String maTaiLieu, String nhaXB, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXB = nhaXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", nhaXB='" + nhaXB + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
