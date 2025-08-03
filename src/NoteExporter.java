package note;

import java.util.List;

public class NoteExporter {
    private ExportStrategy strategy;

    public NoteExporter(ExportStrategy strategy) {
        this.strategy = strategy;
    }

    public void setExportStrategy(ExportStrategy strategy) {
        this.strategy = strategy;
    }

    public String export(Note note) {
        return strategy.export(note);
    }

    public String exportAll(List<? extends Note> notes) {
        StringBuilder result = new StringBuilder();
        for (Note note : notes) {
            // 使用目前策略匯出每一筆Note
            result.append(strategy.export(note)).append("\n");
        }

        return result.toString();
    }

}
