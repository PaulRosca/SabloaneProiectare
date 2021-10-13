import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public int createChapter(String chapterName) {
        this.chapters.add(new Chapter(chapterName));
        return this.chapters.size() - 1;
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }

    public void print() {
        System.out.println("Title\n----------\n" + this.title + "\n----------");
        System.out.println("Written By\n----------");
        this.authors.forEach(a -> {
            a.print();
        });
        System.out.println("----------\nContent\n----------");
        chapters.forEach(c -> {
            c.print();
        });
    }
}
