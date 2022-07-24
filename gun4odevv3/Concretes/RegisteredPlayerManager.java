package gun4odevv3.Concretes;

import gun4odevv3.Abstacts.IBaseManager;

import gun4odevv3.Abstacts.IUserValidator;
import gun4odevv3.Entities.Guest;
import gun4odevv3.Entities.Item;
import gun4odevv3.Entities.RegisteredPlayer;



public class RegisteredPlayerManager implements IBaseManager {

    IUserValidator iUserValidator;

    public RegisteredPlayerManager(IUserValidator iUserValidator) {
        this.iUserValidator = iUserValidator;

    }


    public RegisteredPlayer add(Guest guest) {
        if(iUserValidator.isValid(guest.getId(),guest.getFirstName(),guest.getLastName(),guest.getBirthDate().getYear())){
            System.out.println("Kullanıcı kaydedildi!!");
            return new RegisteredPlayer(guest.getId(), guest.getFirstName(),guest.getLastName(),guest.getNationalityID(),guest.getBirthDate());
        }else{
            throw new RuntimeException("Kullanıcı bilgileri geçersiz");
        }
    }


    public void delete(RegisteredPlayer registeredPlayer) {
        System.out.println("kullanıcı silindi");
    }


    public void update(RegisteredPlayer registeredPlayer) {
        System.out.println("Kullanıcı güncellendi");
    }

    public void deposit(RegisteredPlayer registeredPlayer,double amount){
        registeredPlayer.setBalance(amount);
    }


}
