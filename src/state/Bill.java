package state;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    String code;
    List<Product> products = new ArrayList<>();

    public Bill(String code, List<Product> products) {
        this.code = code;
        this.products = products;
    }

    private double totalPrice() {
        double totalP = 0;
        for (Product product : products) {
            totalP = product.amount * product.price;
        }
        return totalP;
    }

    private void addProduct(List<Product> addProducts) {
        for (Product product : addProducts) {
            products.add(product);
        }
    }

    private void removeProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).equals(product)) {
                products.remove(i);
            }
        }
    }

    private void editProduct(Product product) {
        for (Product product1 : products) {
            if (product1.equals(product)) {
                product1.amount = product.amount;
            }
        }
    }

    public double sale() {
        return 0.2;
    }

    public void submit(State state) {
        state.changeTotalAmount(state.products, products);
        System.out.println("Gia tien:" + totalPrice());
        System.out.println("Tong gia:" + totalPrice() * (1 - sale()));
    }
}
