package note;

import java.util.ArrayList;
import java.util.List;

public class NoteManager {
    private List<Note> notes = new ArrayList<>();

    public void addNote(String title, String content, String createAt, String labeling) {
        notes.add(new Note(title, content, createAt, labeling));
    }

    public List<Note> getAllNotes() {
        return notes;
    }

    public boolean isEmpty() {
        return notes.isEmpty();
    }

    public void searchNote(String title) {
        boolean found = false;
        for (Note note : notes) {
            if (note.getTitle().equalsIgnoreCase(title)) {
                found = true;
                System.out.println("=== 查詢結果 ===");
                System.out.println("Title: " + note.getTitle());
                System.out.println("Content: " + note.getContent());
                System.out.println("Created At: " + note.getCreateAt());
                System.out.println("Labeling: " + note.getLabeling());
                System.out.println();
            }
        }
        if (!found) {
            System.out.println("找不到該標題為「" + title + "」 的筆記");
        }
    }

    public void deleteNote(String title) {
        boolean removed = notes.removeIf(note -> note.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("該筆記已刪除!");
        } else {
            System.out.println("找不到該筆記，無法刪除!");
        }
    }

    public Note getNoteByTitle(String title) {
        for (Note note : notes) {
            if (note.getTitle().equalsIgnoreCase(title)) {
                return note;
            }
        }
        return null; // 如果找不到，返回null
    }
}
