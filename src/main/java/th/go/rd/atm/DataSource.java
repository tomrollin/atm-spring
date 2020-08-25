package th.go.rd.atm;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public interface DataSource {
    ArrayList<Customer> getCustomerData();
}
