package state;

import java.util.List;

public class State {
    private String code;
    private List<Product> products;
    private int totalAmount;

    public State(String code, List<Product> products) {
        this.code = code;
        this.products = products;
        this.totalAmount = totalAmount(products);
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    void changeTotalAmount(List<Product> products, List<ItemProduct> productsExport) {
        for (ItemProduct itemProduct : productsExport) {
            for (Product product : products) {
                if (product.getName().equalsIgnoreCase(itemProduct.getProduct().getName())) {
                    product.setAmount(product.getAmount() - itemProduct.getAmount());
                }
            }
        }
        setTotalAmount(totalAmount(products));
        showAmountItem(products);
        System.out.println("so luong trong kho con: " + getTotalAmount());
    }

    int totalAmount(List<Product> productsCount) {
        int amount = 0;
        for (Product product : productsCount) {
            amount += product.getAmount();
        }
        return amount;
    }

    void showAmountItem(List<Product> productsCount) {
        for (Product product : productsCount) {
            System.out.println(product.getName() + " " + product.getAmount());
        }
    }

    void editAmountProduct(List<Product> productList, String nameProduct, int amount) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getName().equalsIgnoreCase(nameProduct)){
                productList.get(i).setAmount(amount);
            }
        }
    }

}