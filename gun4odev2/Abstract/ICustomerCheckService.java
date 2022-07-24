package gun4odev2.Abstract;

import gun4odev2.Entities.Customer;

public interface ICustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
