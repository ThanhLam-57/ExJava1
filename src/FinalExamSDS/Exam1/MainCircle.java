package FinalExamSDS.Exam1;

public class MainCircle {
    public static void main(String[] args) {

        try {
            Circle circle = new Circle(4);
            System.out.println(circle.getArea());
            System.out.println(circle.toString());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
