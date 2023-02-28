package Oop.Ex3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThuVienMain {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String maTaiLieu = null;
//        String nhaXB = null;
//        int soBanPhatHanh = 50;
//        //book
//        String tenTacGia = null;
//        int soTrang = 0;
//        int gia = 0;
//        //bao
//        String ngayPhatHanh = null;
//        //tap chi
//        String soPhatHanh = null ;
//
//        Book book = new Book(maTaiLieu,nhaXB,soBanPhatHanh,tenTacGia,soTrang,gia);
//        TapChi tapChi = new TapChi(maTaiLieu,nhaXB,soBanPhatHanh,soPhatHanh);
//        Bao bao = new Bao(maTaiLieu,nhaXB,soBanPhatHanh,ngayPhatHanh);
        chonYeuCau();

    }
    static void chonYeuCau(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon yeu cau");
        System.out.println("1.Nhap thong tin");
        System.out.println("2.Hien thi tat ca tai lieu");
        System.out.println("3.Tim kiem");
        int value = scanner.nextInt();
        switch (value){
            case 1:
                nhapThongTin();
                break;
            case 2:
                showFull();
                break;
            case 3:
                timKiem();
                break;
        }
    }
    static void nhapThongTin(){
        System.out.println("1.Nhap thong tin sach");
        System.out.println("2.Nhap thong tin tap chi");
        System.out.println("3.Nhap thong tin bao");
        System.out.println("4.thoat");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case 1:
                nhapSach();
                nhapThongTin();
                break;
            case 2:
                nhapTapChi();
                nhapThongTin();
                break;
            case 3:
                nhapBao();
                nhapThongTin();
                break;
            case 4:
                chonYeuCau();
                break;
        }
    }
    static void nhapSach(){
        String maTaiLieu = null;
        String nhaXB = null;
        int soBanPhatHanh = 50;
        String tenTacGia = null;
        int soTrang = 0;
        int gia = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("So luong sach muon nhap");
        int n = Integer.parseInt(scanner.nextLine());
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap tai lieu thu " + (i+1));
            System.out.println("Nhap ma tai lieu ");
            maTaiLieu = scanner.nextLine();
            System.out.println("Nhap nha XB ");
            nhaXB = scanner.nextLine();
            System.out.println("Nhap soBanPhatHanh ");
            soBanPhatHanh = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap tenTacGia ");
            tenTacGia = scanner.nextLine();
            System.out.println("Nhap soTrang ");
            soTrang = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap gia ");
            gia = Integer.parseInt(scanner.nextLine());
            books[i] = new Book(maTaiLieu,nhaXB,soBanPhatHanh,tenTacGia,soTrang,gia);
        }
    }
    static void nhapTapChi(){
        String maTaiLieu = null;
        String nhaXB = null;
        int soBanPhatHanh = 50;
        String soPhatHanh = null ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("So luong tap chi muon nhap");
        int n = Integer.parseInt(scanner.nextLine());
        TapChi[] tapChis = new TapChi[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap tai lieu thu " + (i+1));
            System.out.println("Nhap ma tai lieu ");
            maTaiLieu = scanner.nextLine();
            System.out.println("Nhap nha XB ");
            nhaXB = scanner.nextLine();
            System.out.println("Nhap soBanPhatHanh ");
            soBanPhatHanh = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap soPhatHanh");
            soPhatHanh = scanner.nextLine();
            tapChis[i] = new TapChi(maTaiLieu,nhaXB,soBanPhatHanh,soPhatHanh);
        }
    }
    static void nhapBao(){
        String maTaiLieu = null;
        String nhaXB = null;
        int soBanPhatHanh = 50;
        String ngayPhatHanh = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("So luong bao muon nhap");
        int n = Integer.parseInt(scanner.nextLine());
        Bao[] baos = new Bao[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap tai lieu thu " + (i+1));
            System.out.println("Nhap ma tai lieu ");
            maTaiLieu = scanner.nextLine();
            System.out.println("Nhap nha XB ");
            nhaXB = scanner.nextLine();
            System.out.println("Nhap soBanPhatHanh ");
            soBanPhatHanh = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap soPhatHanh");
            ngayPhatHanh = scanner.nextLine();
            baos[i] = new Bao(maTaiLieu,nhaXB,soBanPhatHanh,ngayPhatHanh);
        }
    }
    static void showFull(){

    }
    static void timKiem(){
    }
}
