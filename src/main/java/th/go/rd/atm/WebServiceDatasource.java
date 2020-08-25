package th.go.rd.atm;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class WebServiceDatasource implements DataSource{
    public ArrayList<Customer> getCustomerData(){
        // จำลองการต่อ web service API เพื่อดึงข้อมูลลูกค้า
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(100,"ณาณา","p1001"));
        customers.add(new Customer(101,"ตุ้ย วิศ","p1002"));
        return customers;
    }
}
