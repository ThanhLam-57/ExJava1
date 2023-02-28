package Oop;

public class Engineer extends Employee {
    private String product;
    private String team;

    public Engineer(String name, String salary, String department, String product, String team) {
        super(name, salary, department);
        this.product = product;
        this.team = team;
    }
    public String getProduct() {
        return product;
    }
    public Engineer(){};
    public void setProduct(String product) {
        this.product = product;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
