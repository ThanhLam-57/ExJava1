package Oop.Ex2;

public class MainEx2 {
    public static void main(String[] args) {
        Student student = new Student("lam","123","BK",1999,8.0);
        System.out.println(student.toString());
        Staff staff = new Staff("lam1","HN","BK",19.8);
        System.out.println(staff.toString());
    }
}
