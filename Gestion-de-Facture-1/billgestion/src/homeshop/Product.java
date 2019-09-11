package homeshop;

public class Product {
    private String name;
    private String deescription;
    private double price = 100;


    public Product(String name, String deescription, double price) {
        this.name = name;
        this.deescription = deescription;
        this.price = price;
    }

    /**
     * Display a full description of the product
     */


    public void look() {
        this.deescription = deescription;


    }

    /**
     * Add the product to a Bill
     * @param bill the concerned bill
     * @param quantity the quantity to add
     */

    public void buy (Bill bill , Integer quantity) {

    }

    public String getName() {
        return name;
    }

    public String getDeescription() {
        return deescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}