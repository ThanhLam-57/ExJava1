package ExDay1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" Nhập cạnh thứ nhất : ");
            a = scanner.nextDouble();
            System.out.println("Nhập cạnh thứ hai : ");
            b = scanner.nextDouble();
            if (a<0||b<0){
                System.out.println("Nhap lai");
            }
        }while (a<0||b<0);


        System.out.println("Chu vi : " + (a+b)*2);
        System.out.println("Diện tích : " + a*b);
    }
}
