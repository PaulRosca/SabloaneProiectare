import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Paragraph> paragraphs = new ArrayList<>();
    private List<Image> images = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String paragraphText) {
        this.paragraphs.add(new Paragraph(paragraphText));
    }

    public void createNewImage(String imageName) {
        this.images.add(new Image(imageName));
    }

    public void createNewTable(String tableTitle) {
        this.tables.add(new Table(tableTitle));
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);
        this.paragraphs.forEach(p -> {
            p.print();
        });
        this.images.forEach(i -> {
            i.print();
        });
        this.tables.forEach(t -> {
            t.print();
        });
    }
}
