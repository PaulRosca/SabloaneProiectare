public class BookStatistics implements Visitor {

    private int images = 0;
    private int tables = 0;
    private int paragraphs = 0;

    @Override
    public void visit(Book book) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(Section section) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(Paragraph paragraph) {
        this.paragraphs++;
    }

    @Override
    public void visit(Image image) {
        this.images++;
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        this.images++;
    }

    @Override
    public void visit(Table table) {
        this.tables++;
    }

    public void printStatistics() {
        System.out.println("Book Statisticts:");
        System.out.println("*** Number of images : " + this.images);
        System.out.println("*** Number of tables : " + this.tables);
        System.out.println("*** Number of paragprahs : " + this.paragraphs);

    }

}
