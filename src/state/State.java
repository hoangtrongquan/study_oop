package state;

import java.util.List;

public class State {
    String code;
    List<Product> products;
    int totalAmount;

    public State(String code, List<Product> products, int totalAmount) {
        this.code = code;
        this.products = products;
        this.totalAmount = totalAmount;
    }

    void changeTotalAmount(List<Product> products, List<Product> productsExport) {
        for (Product product1 : productsExport) {
            for (Product product : products) {
                if (product.name.equalsIgnoreCase(product1.name)) {
                    product.amount = product.amount - product1.amount;
                }
            }
        }
        totalAmount = totalAmount(products);
        showAmountItem(products);
        System.out.println("so luong trong kho con: " + totalAmount);
    }

    int totalAmount(List<Product> productsCount) {
        for (Product product : productsCount) {
            totalAmount += product.amount;
        }
        return totalAmount;
    }

    void showAmountItem(List<Product> productsCount) {
        for (Product product : productsCount) {
            System.out.println(product.name + " " + product.amount);
        }
    }
}