package tikka.core.mappings;

import org.apache.tika.metadata.Metadata;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import tikka.RandomTikkaUtils;
import tikka.core.abstractDocuments.WordDocument;

import java.io.File;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WordMapper implements Mapper {

    private static final Logger LOGGER = Logger.getLogger("WordMapper");
    private WordDocument wordDocument;

    public WordDocument mapDocumentOf(File _file) {
        wordDocument = new WordDocument();
        try {
            Metadata metadata = RandomTikkaUtils.getMetaData(_file);
            wordDocument.setApplicationName(metadata.get("Application-Name"));
            wordDocument.setAuthor(metadata.get("Author"));
            wordDocument.setCharacterCount(Long.parseLong(metadata.get("Character Count")));
            wordDocument.setContentLength(Long.parseLong(metadata.get("Content-Length")));
            wordDocument.setCreationDate(new DateTime(metadata.get("Creation-Date")).toString());
            wordDocument.setLastModifiedDate(new DateTime(metadata.get("Creation-Date")).toString());
            wordDocument.setPageCount(Integer.parseInt(metadata.get("Page-Count")));
            wordDocument.setWordCount(Long.parseLong(metadata.get("Word-Count")));
            wordDocument.setResourceName(metadata.get("resourceName"));
            wordDocument.setLastSavedDate(DateTime.parse(metadata.get("Last-Save-Date")).toString());
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE,"Exception for file [ " + _file.getName() + " ] , error  :" + e.getMessage());
        }
        return wordDocument;
    }


}


