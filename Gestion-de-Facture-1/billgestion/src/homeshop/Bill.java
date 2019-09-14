package homeshop;

import miam.Resistance;

import java.util.HashMap;
import java.util.Map;

public class Bill {


        private Consumer consumer;
        private Map<Product, Integer> products = new HashMap<Product, Integer>();
        private Delivery delivery;


    public Bill(Consumer consumer, Delivery delivery) {
        this.consumer = consumer;
        this.delivery = delivery;
    }

    /**
         * Add a product with a quantity in the bill
         *
         * @param product  product to add
         * @param quantity quantity of the product
         */

        public void addProduct(Product product, Integer quantity) {
            this.products.put(product, quantity);
        }

        public Consumer getCustomer() {
            return consumer;
        }

        public Map<Product, Integer> getProducts() {
            return products;
        }

    /**
     * Generate an output for the current Bill
     * @param writer object in charge of writing
     */
    public void generate(Writer writer) {
        writer.start();
        writer.writeLine("HomeShop compagnie");
        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        writer.writeLine("");
        writer.writeLine("Facture à l'attention de : ");
        writer.writeLine(consumer.getFullname());
        writer.writeLine(consumer.getAddress());
        writer.writeLine("");
        writer.writeLine("Mode de livraison : " + delivery.getInfo());
        writer.writeLine("");
        writer.writeLine("Produits : ");
        writer.writeLine("-----------------------------------------------------");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)");
            writer.writeLine(product.getDeescription());
            writer.writeLine("");
        }
        writer.writeLine("Livraison : " + delivery.getprice());
        writer.writeLine("-----------------------------------------------------");
        writer.writeLine("Total : " + this.getTotal());
        writer.stop();
    }





    /**
     * get the total price for the current bill, including products and delivery cost
     * @return total price
     */
    public double getTotal() {
        double total = delivery.getprice();
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        total += delivery.getprice();return total;

    }

}
