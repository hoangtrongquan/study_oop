package article;

public class Main {
    public static void main(String[] args) {
        Gallery gallery = new Gallery();
        ImageIpl mountain = new ImageIpl("Mountain.jpg");
        ImageIpl sky = new ImageIpl("Sky.jpg");
        ImageIpl tree = new ImageIpl("Tree.jpg");
        ImageIpl moon = new ImageIpl("Moon.png");

        gallery.add(mountain);
        gallery.add(sky);
        gallery.add(tree);
        gallery.add(moon);
        gallery.swipe();
    }
}
