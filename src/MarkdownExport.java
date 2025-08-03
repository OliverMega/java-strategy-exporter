package note;

public class MarkdownExport implements ExportStrategy {
@Override
public String export(Note note) {
    return "# title: " + note.getTitle() + "\n" +
    " - Content: " + note.getContent() + "\n" +
    " - Created At: " + note.getCreateAt() + "\n" +
    " - Labeling: " + note.getLabeling() + "\n";
}
}
