package gun4odev2;

import gun4odev2.Abstract.BaseCustomerManager;
import gun4odev2.Concrete.CustomerCheckManager;
import gun4odev2.Concrete.NeroCustomerManager;
import gun4odev2.Concrete.StarbucksCustomerManager;
import gun4odev2.Entities.Customer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args){
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
        Customer customer1 = new Customer(1,"berkay mustafa","haberal", LocalDate.of(1999,9,3),"**");
        customerManager.save(customer1);

    }
}
