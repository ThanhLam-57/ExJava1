package Oop.HinhHoc;

public class HinhMain {
    public static void main(String[] args) {
        HinhHocInterface[] hinhHocInterface = new HinhHocInterface[3];
        hinhHocInterface[0] = new HinhTron(3);
        hinhHocInterface[1] = new HinhChuNhat(4,5);

        System.out.println(hinhHocInterface[1].toString());
    }
}
