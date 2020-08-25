package th.go.rd.atm;

public class BankAccount {
    private int id;
    private String name;
    private String type;
    private double balance;

    public BankAccount(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public BankAccount(int id, String name, String type, int balance) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    //----- getters ------------

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
