package Oop.HinhHoc;

public class HinhMain {
    public static void main(String[] args) {
        /**
        * MENU HINH HOC
         * 1.Them hinh hoc
         * 2.In ra tat ca cac hinh
         * 3.In ra hinh co dien tich lon nhat
         * 4.In ra hinh co dien tich be nhat
         * 5.Sap xep theo chu vi tang dan
        * */
        HinhHocInterface[] hinhHocInterface = new HinhHocInterface[3];
        hinhHocInterface[0] = new HinhTron(3);
        hinhHocInterface[1] = new HinhChuNhat(4,5);

        System.out.println(hinhHocInterface[1].toString());
    }
}
