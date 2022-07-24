package gun4odevv3.Entities;

import gun4odevv3.Abstacts.IEntitiy;

public class Campaing implements IEntitiy {
    private int id;
    private String name;
    private double rate;

    public Campaing(int id, String name, double rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
