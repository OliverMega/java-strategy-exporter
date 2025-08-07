package note;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ExportStrategyFactory {
        private static final Map<String, Supplier<ExportStrategy>> strategies = new HashMap<>();

        static {
            strategies.put("plaintext", PlainTextExport::new);
            strategies.put("json", JsonExport::new);
            strategies.put("csv", CsvExport::new);
            strategies.put("markdown", MarkdownExport::new);
        }



     public static ExportStrategy getExportStrategy(String type) {
        // switch (type.toLowerCase()) {
        //     case "plaintext":
        //         return new PlainTextExport();
        //     case "json":
        //         return new JsonExport();
        //     case "csv":
        //         return new CsvExport();
        //     case "markdown":
        //         return new MarkdownExport();
        //     default:
        //         throw new IllegalArgumentException("Unsupported export type: " + type);
        // }

        Supplier<ExportStrategy> supplier = strategies.get(type.toLowerCase());

        if (supplier == null) {
            throw new IllegalArgumentException("Unsupported export type: " + type);
        }

        return supplier.get();
     }

     public static void register(String key, Supplier<ExportStrategy> supplier) {
        strategies.put(key.toLowerCase(), supplier);
     }
}
