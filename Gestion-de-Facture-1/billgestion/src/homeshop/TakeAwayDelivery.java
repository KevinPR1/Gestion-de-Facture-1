package homeshop;

public class TakeAwayDelivery implements Delivery{


    @Override
    public double getprice() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "retrait 0.00 $";
    }
}
