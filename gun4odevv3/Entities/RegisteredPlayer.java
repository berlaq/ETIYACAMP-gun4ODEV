package gun4odevv3.Entities;

import gun4odevv3.Abstacts.IEntitiy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegisteredPlayer implements IEntitiy {
    private int id;
    private String firstName;
    private String lastName;
    private String nationalityID;
    private LocalDate birthDate;
    private double balance;
    private List<Item> playerItems = new ArrayList<Item>();

    public RegisteredPlayer(int id, String firstName, String lastName, String nationalityID, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityID = nationalityID;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityID() {
        return nationalityID;
    }

    public void setNationalityID(String nationalityID) {
        this.nationalityID = nationalityID;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Item> getPlayerItems() {
        return playerItems;
    }

    public void setPlayerItems(Item item) {
        this.playerItems.add(item);
    }
}
