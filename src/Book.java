import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private List<Author> authors = new ArrayList<>();

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void render() {
        System.out.println("Authors :");
        this.authors.forEach(a -> {
            a.print();
        });
        System.out.println();
        GenerateToC toc = new GenerateToC();
        this.accept(toc);
        toc.getToC().render();
        super.render();
    }

}
