package FinalExamSDS.Exam3;

import java.util.Scanner;

public class Exam3Mian {
    public static void main(String[] args) {
        boolean vongLap = true;
        do {
            String nodungVanBan = null;
            System.out.println("Nhap vao noi dung");
            Scanner scanner = new Scanner(System.in);
            nodungVanBan = scanner.nextLine();
            VanBan vanBan = new VanBan(nodungVanBan);
            System.out.println("1.Dem so tu");
            System.out.println("2. Chuan hoa xau theo quy chuan");
            System.out.println("3. Chuyen doi toan bo van ban viet hoa");
            System.out.println("4. Chuyen doi toan bo van ban viet thuong");
            System.out.println("5. Viet hoa chu cai dau tien");
            System.out.println("6. Thoat chuong trinh");
            int value = 0;
            value =scanner.nextInt();
            switch (value){
                case 1:
                    System.out.println(vanBan.demSotu());
                    vanBan.demSotu();
                    break;
                case 2:
                    System.out.println(vanBan.chuanHoa());
                    vanBan.chuanHoa();
                    break;
                case 3:
                    System.out.println(vanBan.chuanHoaVietHoa());
                    vanBan.chuanHoaVietHoa();
                    break;
                case 4:
                    System.out.println(vanBan.chuanHoaVietThuong());
                    vanBan.chuanHoaVietThuong();
                    break;
                case 5:
                    System.out.println(vanBan.vietHoaChuDauTien());
                    vanBan.vietHoaChuDauTien();
                    break;
                case 6:
                    vongLap = false;
            }
        }while (vongLap == true);

    }
}
