package state;

public class Pho extends Product implements Spice,Vegetable{

    public Pho(String name, double money, int amount) {
        super(name, money, amount);
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
