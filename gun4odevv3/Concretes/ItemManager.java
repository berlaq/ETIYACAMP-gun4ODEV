package gun4odevv3.Concretes;

import gun4odevv3.Abstacts.IBaseManager;
import gun4odevv3.Entities.Campaing;
import gun4odevv3.Entities.Item;
import gun4odevv3.Entities.RegisteredPlayer;


public class ItemManager implements IBaseManager {
    RegisteredPlayer registeredPlayer;

    //Kayıtlı kullanıcı giriş yaptıktan sonra ItemManager sadece o kullanıcı için çalışacaktır ve oyun içi ürün alışverişlerini yönetecektir.
    public ItemManager(RegisteredPlayer registeredPlayer) {
        this.registeredPlayer=registeredPlayer;
    }


    //Sisteme ürün eklemek için kullanılır
    public void add(Item item) {
        System.out.println("Ürün sisteme eklendi");
    }

    //Sistemden ürün silmek için kullanılır
    public void delete(Item item) {
        System.out.println("Ürün sistemden silindi");
    }

    //Sistemdeki ürünü güncellemek için kullanılır
    public void update(Item item) {
        System.out.println("Ürün güncellendi");
    }

    //Kullanıcı satın alım yapmak isterse kullanılır
    public void purchase(Item item){
        if(item.getPrice()<=registeredPlayer.getBalance()){
            addInventory(item);
            System.out.println("satın alındı");
            registeredPlayer.setBalance(registeredPlayer.getBalance()- item.getPrice());
        }else{
            System.out.println("Yetersiz bakiye!");
        }
    }

    //ürünün kullanıcı envanterine eklenmesi için kullanılır.
    public void addInventory(Item item){
        registeredPlayer.setPlayerItems(item);
        System.out.println("Ürün envanterinize eklendi");
    }

    //ürün satışı için kullanılacaktır
    public void sellItem(Item item, double amount){
        registeredPlayer.setPlayerItems(registeredPlayer.getPlayerItems().remove(registeredPlayer.getPlayerItems().indexOf(item)));
        registeredPlayer.setBalance(registeredPlayer.getBalance()+amount);
        System.out.println("Ürün satıldı");
    }

    //kampanyalı satış fiyatı ayarlar ve eski fiyatı kaydeder.
    public void updatePrice(Item item, Campaing campaing){
        item.setOldPrice(item.getPrice());
        item.setPrice(item.getPrice()*campaing.getRate());
    }
}
