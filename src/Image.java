import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void render() {
        System.out.println("Image with name: " + this.imageName);
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
