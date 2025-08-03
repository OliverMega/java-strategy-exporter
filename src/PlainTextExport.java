package note;

public class PlainTextExport implements ExportStrategy{
    @Override
    public String export(Note note) {
        return "[Plain Text] " + note.getTitle() + "-" + note.getContent() + "\n";
    }
}
