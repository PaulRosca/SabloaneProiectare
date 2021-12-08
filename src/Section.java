import java.util.ArrayList;
import java.util.List;

public class Section implements Element {

    private String title;
    private List<Element> components = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void render() {
        System.out.println(this.title);
        this.components.forEach(c -> {
            c.render();
        });
    }

    @Override
    public void add(Element e) {
        this.components.add(e);
    }

    @Override
    public void remove(Element e) {
        this.components.remove(e);
    }

    @Override
    public Element get(int i) {
        return this.components.get(i);
    }

    @Override
    public void accept(Visitor visitor) {
        components.forEach(c -> c.accept(visitor));
    }

}
