package note;

import java.util.ArrayList;
import java.util.List;

public class StrategyExportTest {
    public static void main(String[] args) {

        List<Note> notes = new ArrayList<>();
        notes.add(new Note("會議", "明天要開會", "2025-08-04", "工作"));
        // Note note = new Note("會議", "明天要開會", "2025-08-04", "工作");

        NoteExporter exporter = new NoteExporter(new PlainTextExport());
        System.out.println(exporter.exportAll(notes));
        // System.out.println(exporter.export(note));

        exporter.setExportStrategy(new JsonExport());
        // System.out.println(exporter.export(note));
        System.out.println(exporter.exportAll(notes));

         exporter.setExportStrategy(new CsvExport());
        // System.out.println(exporter.export(note));
        System.out.println(exporter.exportAll(notes));

         exporter.setExportStrategy(new MarkdownExport());
        // System.out.println(exporter.export(note));
        System.out.println(exporter.exportAll(notes));
    }
}
