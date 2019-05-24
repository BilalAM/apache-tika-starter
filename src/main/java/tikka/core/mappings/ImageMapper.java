package tikka.core.mappings;

import org.apache.tika.metadata.Metadata;
import tikka.core.abstractDocuments.ImageDocument;
import tikka.core.tika.RandomTikkaUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class ImageMapper implements Mapper {

    private ImageDocument imageDocument;

    @Override
    public ImageDocument mapDocumentOf(File _file) {
        try {
            Path filePath = Paths.get(_file.toURI());
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            imageDocument = new ImageDocument();

            Metadata metadata = RandomTikkaUtils.getMetaData(_file);
            imageDocument.setResourceName(metadata.get("resourceName"));
            imageDocument.setContentLength(Long.parseLong(metadata.get("Content-Length")));
            imageDocument.setImageHeight(Long.parseLong(metadata.get("tiff:ImageLength")));
            imageDocument.setImageWidth(Long.parseLong(metadata.get("tiff:ImageWidth")));
            imageDocument.setModifiedDate(attributes.lastModifiedTime().toString());
            imageDocument.setContentType(metadata.get("Content-Type"));
            imageDocument.setModel(metadata.get("tiff:Model"));
            imageDocument.setSoftware(metadata.get("tiff:Software"));
            imageDocument.setCreationDate(attributes.creationTime().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return imageDocument;
    }


}
