package th.go.rd.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    private DataSource dataSource;

    @Autowired
    public Bank(@Value("${bankname}") String name, DataSource dataSource) {
        this.name = name;
        //this.customers = new ArrayList<>();
        this.dataSource = dataSource;
        this.customers = dataSource.getCustomerData();
    }
    public void addCustomer(Customer c){
        customers.add(c);
    }
    public Customer findCustomer(int id){
        for(Customer element : customers){
            if(element.getId() == id)
                return element;
        }
        return  null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
