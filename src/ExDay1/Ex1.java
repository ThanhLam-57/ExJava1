package ExDay1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh thứ nhất : ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào cạnh thứ hai : ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào cạnh thứ 3 : ");
        double c = scanner.nextDouble();
        if(a>0 && b>0 && c>0 && a+b>c&& b+c>a && a +c >b){
            System.out.println("là hình tam giác");
            double p = (a+b+c)/2;
            System.out.println("Chu vi của tam gác là :" + p*2);
            System.out.println("Diện tích của tm giác là : " + Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        }
        else {
            System.out.println("Không phải tam giác");
        }
    }
}
