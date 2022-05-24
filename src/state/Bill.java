package state;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private String code;
    private List<ItemProduct> itemProducts;

    public Bill(String code, List<ItemProduct> itemProducts) {
        this.code = code;
        this.itemProducts = itemProducts;
    }

    public List<ItemProduct> getItemProducts() {
        return itemProducts;
    }

    public void setItemProducts(List<ItemProduct> itemProducts) {
        this.itemProducts = itemProducts;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return "Bill{" +
                "code='" + code + '\'' +
                ", itemProducts=" + itemProducts +
                '}';
    }

    private double totalPrice() {
        double totalP = 0;
        List<ItemProduct> itemProductList = getItemProducts();
        for (ItemProduct itemProduct : itemProductList) {
            totalP += itemProduct.getProduct().getPrice() * itemProduct.getAmount();
        }
        return totalP;
    }

    public void addProduct(Product product, int quantity) {
//        // TODO: 23/05/2022
        ItemProduct itemProduct = new ItemProduct(product,quantity);
        List<ItemProduct> itemProductList = getItemProducts();
        itemProductList.add(itemProduct);
        setItemProducts(itemProductList);
    }

    private void removeProduct(Product product) {
        //// TODO: 23/05/2022
//        List<Product> products1 = getProducts();
//        for (int i = 0; i < products1.size(); i++) {
//            if (products1.get(i).equals(product)) {
//                products.remove(i);
//            }
//        }
    }

    private void editProduct(Product product) {
        /// TODO: 23/05/2022
//        List<Product> products1 = getProducts();
//        for (Product product1 : products1) {
//            if (product1.equals(product)) {
//                product1.amount = product.amount;
//            }
//        }
    }

    public double sale() {
        return 0.2;
    }

    public void submit(State state) {
        state.changeTotalAmount(state.getProducts(), getItemProducts());
        System.out.println("Gia tien:" + totalPrice());
        System.out.println("Thanh tien:" + totalPrice() * (1 - sale()));
    }
}
