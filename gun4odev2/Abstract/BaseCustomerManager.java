package gun4odev2.Abstract;

import gun4odev2.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
    @Override
    public void save(Customer customer) {
        System.out.println("veritabanına kaydedildi " + customer.getFirstName());
    }
}
