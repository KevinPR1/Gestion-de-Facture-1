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



}
