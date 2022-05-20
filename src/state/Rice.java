package state;

public class Rice extends Product implements Spice{

    public Rice(String name, double money, int amount) {
        super(name, money, amount);
    }

    @Override
    public void addSpice() {
        System.out.println("nuoc mam, ot, tieu");
    }
}
