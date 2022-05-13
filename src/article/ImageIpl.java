package article;

public class ImageIpl implements Image {
    String name;

    public ImageIpl(String name) {
        this.name = name;
    }

    @Override
    public void download() {
        System.out.println("download image " + name);
    }

    @Override
    public void click() {
        System.out.println("zoom image " + name);
    }

    @Override
    public void type() {
        String[] typeImage = name.split("\\.");
        System.out.println(typeImage[1]);
    }

    @Override
    public void swipe() {
        System.out.println("image " + name + " swipe");
    }

    @Override
    public void showImage() {
        System.out.println("show image " + name);
    }
}
