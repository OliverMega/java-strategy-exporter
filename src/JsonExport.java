package note;

public class JsonExport implements ExportStrategy {
@Override
public String export(Note note) {
    return "{ \"title\": \"" + note.getTitle() + "\", \"content\": \"" + note.getContent() + "\"  }" + "\n";
}
}
