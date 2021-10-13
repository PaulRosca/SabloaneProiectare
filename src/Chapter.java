import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subchapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String subChapterName) {
        this.subchapters.add(new SubChapter(subChapterName));
        return this.subchapters.size() - 1;
    }

    public SubChapter getSubChapter(int index) {
        return this.subchapters.get(index);
    }

    public void print() {
        System.out.println("Chapter: " + this.name);
        subchapters.forEach(s -> {
            s.print();
        });
    }

}
