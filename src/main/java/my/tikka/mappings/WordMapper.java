package my.tikka.mappings;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import tikka.RandomTikkaUtils;

import java.io.File;
import java.time.LocalDateTime;

public class WordMapper {

    private WordDocument wordDocument;

    public void mapDocumentOf(File _file){
        wordDocument = new WordDocument();
        Metadata metadata = RandomTikkaUtils.getMetaData(_file);
        wordDocument.setApplicationName(metadata.get("Application-Name"));
        wordDocument.setAuthor(metadata.get("Author"));
        wordDocument.setCharacterCount(Long.parseLong(metadata.get("Character Count")));
        wordDocument.setContentLength(Long.parseLong(metadata.get("Content-Length")));
        wordDocument.setCreationDate(LocalDateTime.parse(metadata.get("Creation-Date")));

    }


}


