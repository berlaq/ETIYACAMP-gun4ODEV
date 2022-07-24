package gun4odevv3.Abstacts;

public interface IUserValidator {
    boolean isValid(int nationalityID, String firstName, String lastName, int birthYear );
}
