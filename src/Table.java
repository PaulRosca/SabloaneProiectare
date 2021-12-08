public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void render() {
        System.out.println("Table with title: " + this.title);
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
