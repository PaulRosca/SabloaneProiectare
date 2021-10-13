import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Element> elements = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String paragraphText) {
        this.elements.add(new Paragraph(paragraphText));
    }

    public void createNewImage(String imageName) {
        this.elements.add(new Image(imageName));
    }

    public void createNewTable(String tableTitle) {
        this.elements.add(new Table(tableTitle));
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);
        this.elements.forEach(e -> {
            e.print();
        });
    }
}
