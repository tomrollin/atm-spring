package th.go.rd.atm;

public class Customer {
    //------- 1. instance variable แบ่งได้เป็น 2 ประเภท
    //----------1.1 attributes
    private int id;
    private String name;
    private String pin;
    //----------1.2 composition : "Has - A" relationship
    //                            ระหว่างคลาส
    private BankAccount account;

    public Customer(int id, String name, String pin) {
        this.id = id;
        this.name = name;
        this.pin = pin;
        this.account = new BankAccount(id,name,"Saving");
    }
    public boolean checkPin(String pin){
//        if(this.pin.equals(pin))
//            return true;
//        else
//            return false;
//      code ด้านบนมีผลลัพธ์เท่ากับ code ด้านล่าง
        return this.pin.equals(pin);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
