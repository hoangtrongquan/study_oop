package study_di;

public class SqlDatabase implements IDatabase{
    @Override
    public void save() {
        System.out.println("saving database Sql");
    }
}
