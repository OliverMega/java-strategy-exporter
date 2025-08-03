package note;

public class CsvExport implements ExportStrategy {
    @Override
    public String export(Note note) {
        return "title,content,createAt,labeling\n" +
        note.getTitle() + "," +
        note.getContent() + "," +
        note.getCreateAt() + "," +
        note.getLabeling() + "\n";
    }
}
