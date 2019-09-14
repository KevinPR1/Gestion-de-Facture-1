package homeshop;

public class DirectDelivery implements Delivery{


    @Override
    public double getprice() {
        return 4.99;
    }

    @Override
    public String getInfo() {
        return "Livraison à domicile 4.99 ";
    }
}
