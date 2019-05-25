package tikka.core.mappings;

import org.apache.commons.lang.StringUtils;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Office;
import org.apache.tika.metadata.TikaCoreProperties;
import tikka.core.abstractDocuments.WordDocument;
import tikka.core.tika.RandomTikkaUtils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WordMapper implements Mapper<WordDocument> {

    private static final Logger LOGGER = Logger.getLogger("WordMapper");
    private WordDocument wordDocument;
        private Map<String, String> properties;

    public WordDocument mapDocumentOf(File _file) {
            LOGGER.log(Level.INFO, "Starting mapping process for Word Document [ " + _file.getName() + " ]");
            properties = new HashMap<>();
        wordDocument = new WordDocument();
        try {
            Metadata metadata = RandomTikkaUtils.getMetaData(_file);
                LOGGER.log(Level.INFO, "Metadata has been recieved , properties are being prepared now...");

                String creator = StringUtils.defaultIfBlank(metadata.get(TikaCoreProperties.CREATOR), "empty");
                String createdAt = StringUtils.defaultIfBlank(metadata.get(TikaCoreProperties.CREATED), "empty");
                String comment = StringUtils.defaultIfBlank(metadata.get(TikaCoreProperties.COMMENTS), "empty");
                String creationTool = StringUtils.defaultIfBlank(metadata.get("Application-Name"), "empty");
                String description = StringUtils.defaultIfBlank(metadata.get(TikaCoreProperties.DESCRIPTION), "empty");
                String docuType = StringUtils.defaultIfBlank(metadata.get(TikaCoreProperties.TYPE), "empty");
                String format = StringUtils.defaultIfBlank(metadata.get(TikaCoreProperties.FORMAT), "empty");
                String lastModified = StringUtils.defaultIfBlank(metadata.get(TikaCoreProperties.MODIFIED), "empty");
                String modifiedBy = StringUtils.defaultIfBlank(metadata.get(TikaCoreProperties.MODIFIER), "empty");
                String saveDate = StringUtils.defaultIfBlank(metadata.get(Office.SAVE_DATE), "empty");
                String printDate = StringUtils.defaultIfBlank(metadata.get(Office.PRINT_DATE), "empty");
                String pageCount = StringUtils.defaultIfBlank(metadata.get(Office.PAGE_COUNT), "0");
                String wordCount = StringUtils.defaultIfBlank(metadata.get(Office.WORD_COUNT), "0");
                String imageCount = StringUtils.defaultIfBlank(metadata.get(Office.IMAGE_COUNT), "0");
                String paraCount = StringUtils.defaultIfBlank(metadata.get(Office.PARAGRAPH_COUNT), "0");
                String lineCount = StringUtils.defaultIfBlank(metadata.get(Office.LINE_COUNT), "0");

                wordDocument.setCreatedAt(createdAt);
                properties.put("Created At ", createdAt);
                wordDocument.setCreator(creator);
                properties.put("Creator", creator);
                wordDocument.setComments(comment);
                properties.put("Comments", comment);
                wordDocument.setCreatedTool(creationTool);
                properties.put("Creation Tool", creationTool);
                wordDocument.setDescription(description);
                properties.put("Description", description);
                wordDocument.setType(docuType);
                properties.put("Document Type", docuType);
                wordDocument.setFormat(format);
                properties.put("Document Format", format);
                wordDocument.setModifiedAt(lastModified);
                properties.put("Last Modified At ", lastModified);
                wordDocument.setModifiedBy(modifiedBy);
                properties.put("Last Modified By ", modifiedBy);
                wordDocument.setLastSavedDate(saveDate);
                properties.put("Saved Date", saveDate);
                wordDocument.setLastPrintedDate(printDate);
                properties.put("Printed At", printDate);
                wordDocument.setPageCount(Integer.parseInt(pageCount));
                properties.put("Total Pages", pageCount);
                wordDocument.setWordCount(Long.parseLong(wordCount));
                properties.put("Total Words", wordCount);
                wordDocument.setImagesCount(Integer.parseInt(imageCount));
                properties.put("Total Images", imageCount);
                wordDocument.setParagraphsCount(Integer.parseInt(paraCount));
                properties.put("Total Paragraphs", paraCount);
                wordDocument.setLinesCount(Long.parseLong(lineCount));
                properties.put("Total Lines", lineCount);
                LOGGER.log(Level.INFO,
                        "Total of [ " + properties.size() + " ] properties has been parsed and prepared..");

        } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Exception for file [ " + _file.getName() + " ] , error  :" + e.getMessage(),
                        e);
        }
        return wordDocument;
    }

        public Map<String, String> getAllProperties() {
                return properties;
        }


}


