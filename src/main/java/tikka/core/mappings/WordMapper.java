package tikka.core.mappings;

import org.apache.tika.metadata.Metadata;
import org.joda.time.DateTime;
import tikka.RandomTikkaUtils;

import java.io.File;


public class WordMapper implements Mapper {

    private WordDocument wordDocument;

    public WordDocument mapDocumentOf(File _file) {
        wordDocument = new WordDocument();
        try {
            Metadata metadata = RandomTikkaUtils.getMetaData(_file);
            wordDocument.setApplicationName(metadata.get("Application-Name"));
            wordDocument.setAuthor(metadata.get("Author"));
            wordDocument.setCharacterCount(Long.parseLong(metadata.get("Character Count")));
            wordDocument.setContentLength(Long.parseLong(metadata.get("Content-Length")));
            wordDocument.setCreationDate(DateTime.parse(metadata.get("Creation-Date")).toString());
            wordDocument.setLastModifiedDate(DateTime.parse(metadata.get("Last-Modified")).toString());
            wordDocument.setPageCount(Integer.parseInt(metadata.get("Page-Count")));
            wordDocument.setWordCount(Long.parseLong(metadata.get("Word-Count")));
            wordDocument.setResourceName(metadata.get("resourceName"));
            wordDocument.setLastSavedDate(DateTime.parse(metadata.get("Last-Save-Date")).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wordDocument;
    }


}


