package gun4odevv3;

import gun4odevv3.Concretes.CampaingManager;
import gun4odevv3.Concretes.ItemManager;
import gun4odevv3.Concretes.RegisteredPlayerManager;
import gun4odevv3.Entities.Campaing;
import gun4odevv3.Entities.Guest;
import gun4odevv3.Entities.Item;
import gun4odevv3.Entities.RegisteredPlayer;
import gun4odevv3.Utilities.UserValidator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Guest guest = new Guest(1,"berkay","haberal","123", LocalDate.of(1999,9,3));
        RegisteredPlayerManager registeredPlayerManager1 = new RegisteredPlayerManager(new UserValidator());

        RegisteredPlayer registeredPlayer1 = registeredPlayerManager1.add(guest);

        registeredPlayer1.setBalance(200);

        ItemManager itemManager = new ItemManager(registeredPlayer1);
        Item item1 = new Item(1,"dolunay kılıcı",1000);
        Item item2 = new Item(2,"ay tılsımı",500);

        itemManager.add(item1);
        itemManager.add(item2);
        itemManager.addInventory(item1);

        Campaing campaing1 = new Campaing(1,"patron çıldırdı",0.5);
        CampaingManager campaingManager = new CampaingManager();
        campaingManager.add(campaing1);

        itemManager.updatePrice(item1,campaing1);

        itemManager.purchase(item1);


    }
}
