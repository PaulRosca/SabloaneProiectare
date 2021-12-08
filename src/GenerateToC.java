public class GenerateToC implements Visitor {

    private TableOfContents toc = new TableOfContents();

    @Override
    public void visit(Book book) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(Section section) {
        toc.addChapter(section.getTitle());
    }

    @Override
    public void visit(Paragraph paragraph) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(Image image) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ImageProxy imageProxy) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(Table table) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(TableOfContents toc) {
        // TODO Auto-generated method stub

    }

    public TableOfContents getToC() {
        return toc;
    }

}
