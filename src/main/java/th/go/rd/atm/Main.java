package th.go.rd.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        ATM amt = context.getBean(ATM.class);
        Bank bank = context.getBean(Bank.class);
        System.out.println(bank);
    }
}
