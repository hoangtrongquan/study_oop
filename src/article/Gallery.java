package article;

import java.util.ArrayList;
import java.util.List;

public class Gallery implements Image {
    List<Image> images = new ArrayList<>();

    public void add(ImageIpl imageIpl) {
        images.add(imageIpl);
    }

    @Override
    public void download() {
        for (Image imageIpl : images) {
            imageIpl.download();
        }
    }

    @Override
    public void click() {
        for (Image imageIpl : images) {
            imageIpl.click();
        }
    }

    @Override
    public void type() {
        for (Image imageIpl : images) {
            imageIpl.type();
        }
    }

    @Override
    public void swipe() {
        for (Image imageIpl : images) {
            imageIpl.swipe();
        }
    }

    @Override
    public void showImage() {
        for (Image imageIpl : images) {
            imageIpl.showImage();
        }
    }
}
