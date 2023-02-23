package ExDay1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá phòng");
        int giaPhong = scanner.nextInt();
            do {
                if(giaPhong<0){
                    System.out.println("Gian phong phải lon hon 0");
                    System.out.println("Nhập giá phòng");
                    giaPhong = scanner.nextInt();
                }
            } while (giaPhong < 0);
        do {
            System.out.println("Nhap so dien tháng truoc : ");
            a = scanner.nextInt();
            System.out.println("Nhap so dien tháng nnay : ");
            b = scanner.nextInt();
            if (a < 0 || b< 0 || a>b){
                System.out.println("Nhap lai");
            }
        }while (a < 0 || b< 0 || a>b);
        do {
            System.out.println("Nhap so nuoc tháng truoc : ");
            c = scanner.nextInt();
            System.out.println("Nhap so nuoc tháng nnay : ");
            d = scanner.nextInt();
            if (c < 0 || d< 0 || c>d){
                System.out.println("Nhap lai");
            }
        }while (c < 0 || d< 0 || c>d);

        System.out.println("Tổng tiền phòng : "+ (giaPhong+(b-a)*4+(d-c)*30));
    }
}
