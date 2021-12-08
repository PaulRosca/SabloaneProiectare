public interface Visitor {
    public void visit(Book book);

    public void visit(Section section);

    public void visit(Paragraph paragraph);

    public void visit(Image image);

    public void visit(ImageProxy imageProxy);

    public void visit(Table table);

    public void visit(TableOfContents toc);

}
