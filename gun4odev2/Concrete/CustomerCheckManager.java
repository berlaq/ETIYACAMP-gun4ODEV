package gun4odev2.Concrete;

import gun4odev2.Abstract.ICustomerCheckService;
import gun4odev2.Entities.Customer;
import gun4odev2.Mernis.RGSKPSPublicSoap;


public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        RGSKPSPublicSoap rgskpsPublicSoap = new RGSKPSPublicSoap();
        try {
            return  rgskpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityID()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
        } catch (Exception e) {
            throw new RuntimeException("yalannn");
        }

    }
}
