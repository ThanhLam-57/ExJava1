package Oop;

public class Employee {
    private String name;
    private String salary;
    private String department;

    public Employee(String name, String salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public  Employee(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
