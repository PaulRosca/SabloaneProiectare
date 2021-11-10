public class ImageProxy implements Element {

    private String imageName;
    private Image realImage;

    public ImageProxy(String imageName) {
        this.imageName = imageName;
    }

    public Image loadImage() {
        if (this.realImage == null) {
            this.realImage = new Image(imageName);
        }
        return this.realImage;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void add(Element e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Element e) {
        // TODO Auto-generated method stub

    }

    @Override
    public Element get(int i) {
        // TODO Auto-generated method stub
        return null;
    }

}
