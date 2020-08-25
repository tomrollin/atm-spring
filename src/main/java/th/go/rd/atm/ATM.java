package th.go.rd.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ATM {
    private Bank bank;
    private Customer currentCustomer;

    @Autowired
    public ATM(Bank bank) {
        this.bank = bank;
    }
    public void validateCustomer(int id,String pin){
        Customer matchingCustomer = bank.findCustomer(id);
        if(matchingCustomer != null && matchingCustomer.checkPin(pin)){
            currentCustomer = matchingCustomer;
        }
    }
    public void deposit(double amount){
        currentCustomer.getAccount().deposit(amount);
    }
    public void withdraw(double amount){
        currentCustomer.getAccount().withdraw(amount);
    }
    public void transfer(int receiverId,double amount){
        Customer receiver = bank.findCustomer(receiverId);
        currentCustomer.getAccount().withdraw(amount);
        receiver.getAccount().deposit(amount);
    }
    public double getBalance(){
        return currentCustomer.getAccount().getBalance();
    }
    public void end(){
        currentCustomer = null;
    }
}
