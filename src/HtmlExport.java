package note;

public class HtmlExport implements ExportStrategy {
    @Override
    public String export(Note note) {
        return "<html>\n" +
        "<head>\n" + "<title>" + note.getTitle() + "</title>\n" +
        "</head>\n" +
        "<body>\n" +
        "<h1>" + note.getTitle() + "</h1>\n" +
        "<p>Content: " + note.getContent() + "</p>\n" +
        "<p>Created At: " + note.getCreateAt() + "</p>\n" +
        "<p>Labeling: " + note.getLabeling() + "</p>\n" +
        "</body>\n" +
        "</html>\n" + "\n";
    }
}
