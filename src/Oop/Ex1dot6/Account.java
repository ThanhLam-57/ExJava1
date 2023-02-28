package Oop.Ex1dot6;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int Credit(int amount){
        balance = balance + amount;
        return balance;
    }
    public int Debit(int amount){
        if(amount < balance){
            balance = balance - amount;
            return balance;
        }else {
            System.out.println("So du khong kha dung");
            return balance;
        }
    }
    public int toTransfer(Account account, int amount){
        if(amount < this.balance){
            //Tru tiẻn
            this.balance = this.balance - amount;
            //Cong tien
            account.balance = account.balance + amount;
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
