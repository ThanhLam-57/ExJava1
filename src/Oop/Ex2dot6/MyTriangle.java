package Oop.Ex2dot6;

public class MyTriangle extends MyPoint{
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3,int y3) {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    /**
    *@author: Nguyễn Thanh Lâm
    *@since: 28/2/2023
    *@description: Hàm thực hiện tính chu vi hình tam giác
    *@return: Hàm trả về chu vi hỉnh tam giác
    */
    public double getPerimeter(){
        double perimeter = v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
        return perimeter;
    }
    /**
    *@author:
    *@since:
    *@description: hàm thực hiện kiểm tra loại tam giác
    *@return:
    */
    public String getType(){
        if ((v1.distance(v2) == v2.distance(v3)) && (v1.distance(v2) == v2.distance(v3)) && (v1.distance(v1) == v2.distance(v3))){
            return "equilateral";
        } else if ((v1.distance(v2) == v2.distance(v3)) || (v1.distance(v2) == v2.distance(v3)) || (v1.distance(v1) == v2.distance(v3))) {
            return "isosceles";
        }else {
            return "scalene";
        }
    }
}
