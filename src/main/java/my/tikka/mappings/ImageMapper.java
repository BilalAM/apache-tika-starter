package my.tikka.mappings;

import org.apache.tika.metadata.Metadata;
import tikka.RandomTikkaUtils;

import java.io.File;

public class ImageMapper implements Mapper {

    private ImageDocument imageDocument;

    @Override
    public ImageDocument mapDocumentOf(File _file) {
        imageDocument = new ImageDocument();
        try {
            Metadata metadata = RandomTikkaUtils.getMetaData(_file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return imageDocument;
    }
}
