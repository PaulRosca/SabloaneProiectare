import java.util.ArrayList;

public class TableOfContents implements Element {

    private ArrayList<String> chapters = new ArrayList<>();

    @Override
    public void render() {
        System.out.println("##########Table of contents##########");
        for (String chapter : chapters) {
            System.out.println(chapter);
        }
        System.out.println("#####################################");
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
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void addChapter(String chapter) {
        chapters.add(chapter);
    }

}
