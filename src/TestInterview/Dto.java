package TestInterview;

public class Dto {
    private int id;
    private int idParent;
    int bonus;

    public Dto(int id, int idParent, int bonus) {
        this.id = id;
        this.idParent = idParent;
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdParent() {
        return idParent;
    }

    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Dto{" +
                "id=" + id +
                ", idParent=" + idParent +
                ", bonus=" + bonus +
                '}';
    }
}
