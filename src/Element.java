public interface Element {
    public void render();

    public void add(Element e);

    public void remove(Element e);

    public Element get(int i);

    public void accept(Visitor visitor);
}
