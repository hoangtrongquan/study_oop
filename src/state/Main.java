package state;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product productS1 = new Pho("Pho",25000,200,"Bo");
        Product productS2 = new Pho("Pho",26000,100,"Ga");
        Product productS3 = new Pho("Pho",27000,400,"heo");
        Product productS4 = new Rice("Com tam",30000,500);
        List<Product> productsS = new ArrayList<>();
        productsS.add(productS1);
        productsS.add(productS2);
        productsS.add(productS3);
        productsS.add(productS4);
        State state = new State("state",productsS,1200);

        Product product1 = new Pho("Pho",25000,2,"Bo");
        Product product2 = new Pho("Pho",26000,1,"Ga");
        Product product3 = new Pho("Pho",27000,4,"heo");
        Product product4 = new Rice("Com tam",30000,5);
        Product product5 = new Rice("Com tam",30000,5);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        Bill bill = new Bill("bill",products);

        bill.submit(state);

    }
}
