package Models;

public class Addon {
    private int id;
    private String addon_name;
    private double price;

    public Addon(int id, String addon_name, double price) {
        this.id = id;
        this.addon_name = addon_name;
        this.price = price;
    }

    public Addon() {
    }

    public String getAddon_name() {
        return addon_name;
    }

    public void setAddon_name(String addon_name) {
        this.addon_name = addon_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
