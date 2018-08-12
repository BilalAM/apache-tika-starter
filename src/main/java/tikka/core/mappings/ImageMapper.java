package tikka.core.mappings;

import org.apache.tika.metadata.Metadata;
import org.joda.time.DateTime;
import tikka.RandomTikkaUtils;

import java.io.File;

public class ImageMapper implements Mapper {

    private ImageDocument imageDocument;

    @Override
    public ImageDocument mapDocumentOf(File _file) {
        imageDocument = new ImageDocument();
        try {
            Metadata metadata = RandomTikkaUtils.getMetaData(_file);
            imageDocument.setResourceName(metadata.get("resourceName"));
            imageDocument.setContentLength(Long.parseLong(metadata.get("Content-Length")));
            imageDocument.setImageHeight(Long.parseLong(metadata.get("tiff:ImageLength")));
            imageDocument.setImageWidth(Long.parseLong(metadata.get("tiff:ImageWidth")));
            imageDocument.setModifiedDate(DateTime.parse(metadata.get("Last-Save-Date")).toString());
            imageDocument.setContentType(metadata.get("Content-Type"));
            imageDocument.setNumberOfTables(Integer.parseInt(metadata.get("Number Of Tables")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return imageDocument;
    }




}
