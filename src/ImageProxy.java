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
    public void render() {
        loadImage().render();
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
