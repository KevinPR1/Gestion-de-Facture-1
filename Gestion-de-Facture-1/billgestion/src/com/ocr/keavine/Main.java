package com.ocr.keavine;


import homeshop.*;
import paris.Bus;
import paris.MoyenDeLocomotion;
import paris.Parisien;
import paris.Taxi;


public class Main {

    public static void main(String[] args) {
        Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
        Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
        Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

        Consumer consumer = new Consumer("Juste Leblanc", "19 rue Germain Pilon, Paris");

        Bill bill = new Bill(consumer, new RelayDelivery(27));
        /*bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);*/

        try {
            bill.generate(new FileWriter("facture_leblanc"));

        } catch (NoProductInBillException e) {
            System.err.println("Pas de produit dans la facture");
        }
    }
}
