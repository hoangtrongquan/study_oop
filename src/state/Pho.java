package state;

public class Pho extends Product implements Spice,Vegetable{
    String type;

    public Pho(String name, double money, int amount, String type) {
        super(name, money, amount);
        this.type = type;
    }

    @Override
    public void addSpice() {
        System.out.println("fish sauce, ot");
    }

    @Override
    public void addVegetable() {
        System.out.println("cai, xa lach, hoa chuoi");
    }
}
