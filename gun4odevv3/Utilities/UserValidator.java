package gun4odevv3.Utilities;

import gun4odevv3.Abstacts.IUserValidator;

public class UserValidator implements IUserValidator {

    @Override
    public boolean isValid(int nationalityID, String firstName, String lastName, int birthYear) {
        //doğrulama kodları
        return true;
    }
}
