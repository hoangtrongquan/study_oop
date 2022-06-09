package study_di;

public class XmlDatabase implements IDatabase{
    @Override
    public void save() {
        System.out.println("saving database xml");
    }
}
