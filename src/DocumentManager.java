public class DocumentManager {
    private static DocumentManager instance = null;
    private Book book;

    private DocumentManager() {
    }

    public static DocumentManager getInstance() {
        if (DocumentManager.instance == null) {
            DocumentManager.instance = new DocumentManager();
        }
        return DocumentManager.instance;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
