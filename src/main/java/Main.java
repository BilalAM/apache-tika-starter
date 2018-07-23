import org.apache.tika.Tika;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final Tika TIKA = new Tika();

    public static void main(String[] arg) throws Exception {
        getFileMetaData(new File("hobbit.jpeg")).forEach((key, value) -> System.out.println(key + " --> " + value));
    }

    public static String getFileContentType(File file) throws IOException {
        return TIKA.detect(file);
    }

    public static Map<String, String> getFileMetaData(File file) throws Exception {
        Map<String, String> pairs = new HashMap<>();
        Parser parser = new AutoDetectParser();
        InputStream input = TikaInputStream.get(Paths.get(file.toURI()));
        Metadata metaData = new Metadata();
        BodyContentHandler handler = new BodyContentHandler();
        ParseContext context = new ParseContext();
        parser.parse(input, handler, metaData, context);
        for (String metadata : metaData.names()) {
            pairs.put(metadata, metaData.get(metadata));
        }
        return pairs;

    }

}
