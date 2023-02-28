package Oop;

public class OopMain {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(4,5);
        System.out.println(hinhChuNhat.getChieuDai()+" "+ hinhChuNhat.tinhChuVi());
        HinhVuong hinhVuong = new HinhVuong(4);
        System.out.println(hinhVuong.tinhChuVi() +"   ");
    }
}
