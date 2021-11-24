public class DocumentManager {
    private static DocumentManager instance = new DocumentManager();
    private Book book;

    private DocumentManager() {
    }

    public static DocumentManager getInstance() {
        return DocumentManager.instance;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
