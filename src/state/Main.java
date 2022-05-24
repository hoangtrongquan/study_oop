package state;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product productS1 = new Pho("Pho bo", 25000, 200);
        Product productS2 = new Pho("Pho ga", 26000, 100);
        Product productS3 = new Pho("Pho gio", 27000, 400);
        Product productS4 = new Rice("Com tam", 30000, 500);
        List<Product> productsS = new ArrayList<>();
        productsS.add(productS1);
        productsS.add(productS2);
        productsS.add(productS3);
        productsS.add(productS4);
        State state = new State("state", productsS);
        state.editAmountProduct(productsS, "Pho", 900);

        Bill bill = new Bill("bill", new ArrayList<>());
        bill.addProduct(productS1, 2);
        bill.addProduct(productS2, 3);
        bill.addProduct(productS3, 4);
        bill.addProduct(productS4, 5);

        bill.submit(state);
        List<Bill> bills = new ArrayList<>();
        bills.add(bill);
        Log log = new Log("bill1", bills, LocalDateTime.now());
        System.out.println(log);

        productS1.setPrice(2000);

        List<Bill> bills1 = new ArrayList<>();
        bills1.add(bill);

        Log log1 = new Log("bill2", bills1, LocalDateTime.now());
        System.out.println(log1);
    }
}
