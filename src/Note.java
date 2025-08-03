package note;
import java.util.ArrayList;
import java.util.List;

public class Note implements Exportable /*Printable*/ {
    private String title;
    private String content;
    private String createAt;
    private String labeling;
    private boolean isTop;

    public Note(String title, String content, String createAt, String labeling) {
        this.title = title;
        this.content = content;
        this.createAt = createAt;
        this.labeling = labeling;
        this.isTop = false;
    }

    // @Override
    // public void printInfo() {
    //     System.out.println("Title:" + title);
    //     System.out.println("Content:" + content);
    //     System.out.println("Created at: " + createAt);
    //     System.out.println("Labeling: "+ labeling);
    //     System.out.println("Is Top:" + isTop);
    // }

    @Override
    public String export() {
        return "[Note] title:" + title +
        ", content:" + content +
         ", created at: " + createAt +
          ", labeling: " + labeling + "\n";
   
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getCreateAt() { return createAt; }
    public void setCreateAt(String createAt) { this.createAt = createAt; }

    public String getLabeling() { return labeling; }
    public void setLabeling(String labeling) { this.labeling = labeling; }

    // public static void main(String[] args) {
    //     // Note note = new Note("Meeting Notes", "Discuss roadmap", "2025-08-01", "Work");
    //     // note.printInfo();
    //     List<Exportable> notes = new ArrayList<>();
    //     notes.add(new Note("Meeting Notes", "Discuss roadmap", "2025-08-01", "Work"));
        
    //     for (Exportable note : notes) {
    //         System.out.print(note.export());
    //     }
        
    // }
}
