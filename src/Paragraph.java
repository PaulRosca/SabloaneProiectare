public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        if (this.alignStrategy != null) {
            this.alignStrategy.render(this.text);
        } else {
            System.out.println(this.text);
        }
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

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }
}
