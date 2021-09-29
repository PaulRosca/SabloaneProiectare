public class Book {
    private String title;
    private StringBuilder content;

    public Book(String title) {
        this.title = title;
        this.content = new StringBuilder();
    }

    public void createNewParagraph(String paragraph) {
        this.content.append(paragraph + "\n");
    }

    public void createNewImage(String img) {
        this.content.append(img + "\n");
    }

    public void createNewTable(String tbl) {
        this.content.append(tbl + "\n");
    }

    public void print() {
        System.out.println("Title\n----------\n" + this.title + "\n----------\n");
        System.out.println("Content\n----------\n" + this.content);
    }
}
