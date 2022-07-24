package gun4odevv3.Concretes;

import gun4odevv3.Abstacts.IBaseManager;
import gun4odevv3.Entities.Campaing;
import gun4odevv3.Entities.Item;

public class CampaingManager implements IBaseManager {



    public void add(Campaing campaing){
        System.out.println("Yeni kampanya eklendi");
    }
    public void delete(Campaing campaing){
        System.out.println("Kampanya silindi");
    }
    public void update(Campaing campaing){
        System.out.println("Kampanya güncellendi");
    }

}
