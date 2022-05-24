package state;

public class ItemProduct {
    private Product product;
    private int amount;

    public ItemProduct(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ItemProduct{" + "product=" + product + ", amount=" + amount + '}';
    }
}
