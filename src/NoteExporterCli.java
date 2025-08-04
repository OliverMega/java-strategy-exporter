package note;

import java.util.*;

public class NoteExporterCli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NoteExporter exporter = new NoteExporter(new PlainTextExport());
        NoteManager noteManager = new NoteManager();

        while (true) {
            System.out.println("\n=== Note Exporter ===");
            System.out.println("[1] 新增筆記");
            System.out.println("[2] 選擇匯出格式");
            System.out.println("[3] 匯出所有筆記");
            System.out.println("[4] 查詢單一筆記 (輸入標題)");
            System.out.println("[5] 刪除某筆筆記 (輸入標題)");
            System.out.println("[0] 離開");
            System.out.print("請選擇: ");

            String input = scanner.nextLine();

            switch (input) {
                // 建立新筆記
                case "1":
                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Content: ");
                    String content = scanner.nextLine();

                    System.out.print("Created At (yyyy-MM-dd): ");
                    String createAt = scanner.nextLine();

                    System.out.print("Labeling: ");
                    String labeling = scanner.nextLine();

                    noteManager.addNote(title, content, createAt, labeling);
                    System.out.println("筆記已新增! 總筆記數: " + noteManager.getAllNotes().size());
                    break;

                // 選擇匯出格式
                case "2":
                    System.out.println("[1] PlainText");
                    System.out.println("[2] JSON");
                    System.out.println("[3] CSV");
                    System.out.println("[4] Markdown");
                    System.out.print("請選擇格式: ");
                    String format = scanner.nextLine();

                    switch (format) {
                        case "1":
                            exporter.setExportStrategy(new PlainTextExport());
                            break;
                        case "2":
                            exporter.setExportStrategy(new JsonExport());
                            break;
                        case "3":
                            exporter.setExportStrategy(new CsvExport());
                            break;
                        case "4":
                            exporter.setExportStrategy(new MarkdownExport());
                            break;
                        default:
                            System.out.println("無效選擇");
                            break;
                    }
                    System.out.println("匯出格式已設定!");
                    break;

                case "3":
                    // 匯出所有筆記
                    if (noteManager.isEmpty()) {
                        System.out.println("尚未新增任何筆記");
                    } else {
                        System.out.println("\n=== Exported Notes ===");
                        System.out.println(exporter.exportAll(noteManager.getAllNotes()));
                        System.out.println("=========================");
                    }
                    break;

                case "0":
                    System.out.println("再見!");
                    scanner.close();
                    return;

                default:
                    System.out.println("請輸入有效選項");
            }
        }
    }
}
