package tikka.core.mappings;

import org.apache.tika.metadata.Metadata;
import tikka.core.abstractDocuments.PdfDocument;
import tikka.core.tika.RandomTikkaUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PdfMapper implements Mapper {

    // valid time type for kibana = November 25th 2011, 02:40:00.000
    private PdfDocument pdfDocument;
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public PdfDocument mapDocumentOf(File _file) {
        pdfDocument = new PdfDocument();
        try {
            Path filePath = Paths.get(_file.toURI());
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            Metadata metadata = RandomTikkaUtils.getMetaData(_file);
            //String date = DATE_FORMAT.format(new Date(metadata.get("created")));


          //  pdfDocument.setCreated(date.toString());
            pdfDocument.setAuthor(metadata.get("Author"));
            pdfDocument.setContentLength(Integer.parseInt(metadata.get("Content-Length")));
            pdfDocument.setCreater(metadata.get("creator"));
            pdfDocument.setNumberOfPages(Integer.parseInt(metadata.get("xmpTPg:NPages")));
            pdfDocument.setProducer(metadata.get("pdf:docinfo:producer"));
            pdfDocument.setResourceName(metadata.get("resourceName"));
            pdfDocument.setContent(RandomTikkaUtils.getFileContent(_file));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pdfDocument;
    }
}
