package gun4odev2.Concrete;

import gun4odev2.Abstract.BaseCustomerManager;
import gun4odev2.Abstract.ICustomerCheckService;
import gun4odev2.Abstract.ICustomerService;
import gun4odev2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {

        if(customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        }else{
            throw new RuntimeException("Not a valid Person");
        }

    }}
