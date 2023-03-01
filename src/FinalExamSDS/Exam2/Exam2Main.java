package FinalExamSDS.Exam2;

import java.util.Scanner;

public class Exam2Main {
    public static void main(String[] args) {
        NhanVien nhanVien = new KyThuat("NV1","Nguyen Thanh Lam","1999","HaNoi","Cntt");
        System.out.println("Nhap thong tin nhan vien ky thuat");
        Scanner scanner = new Scanner((System.in));
        System.out.println("Nhap ma nhan vien");
        String a = scanner.nextLine();
        System.out.println("Nhap ten nhan vien");
        String b = scanner.nextLine();
        System.out.println("Nhap nam sinh nhan vien");
        String c = scanner.nextLine();
        System.out.println("Nhap dia chi nhan vien");
        String d = scanner.nextLine();
        System.out.println("Nhap chuyen nganh nhan vien");
        String e = scanner.nextLine();
        KyThuat kyThuat = new KyThuat(a,b,c,d,e);
        System.out.println(kyThuat.toString());
        System.out.println(nhanVien);

    }
}
