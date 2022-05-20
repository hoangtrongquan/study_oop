package state;

public class Noodles extends Product implements Vegetable{
    public Noodles(String name, double money, int amount) {
        super(name, money, amount);
    }

    @Override
    public void addVegetable() {
        System.out.println("cai, xa lach, hoa chuoi");
    }
}
