package my.tikka.mappings;

import java.time.LocalDateTime;

public class WordMapper {

    private String author;
    private String applicationName;
    private String resourceName;
    private long characterCount;
    private long contentLength;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    private LocalDateTime lastPrintedDate;
    private LocalDateTime lastSavedDate;
    private int pageCount;
    private long wordCount;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public long getCharacterCount() {
        return characterCount;
    }

    public void setCharacterCount(long characterCount) {
        this.characterCount = characterCount;
    }

    public long getContentLength() {
        return contentLength;
    }

    public void setContentLength(long contentLength) {
        this.contentLength = contentLength;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public LocalDateTime getLastPrintedDate() {
        return lastPrintedDate;
    }

    public void setLastPrintedDate(LocalDateTime lastPrintedDate) {
        this.lastPrintedDate = lastPrintedDate;
    }

    public LocalDateTime getLastSavedDate() {
        return lastSavedDate;
    }

    public void setLastSavedDate(LocalDateTime lastSavedDate) {
        this.lastSavedDate = lastSavedDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public long getWordCount() {
        return wordCount;
    }

    public void setWordCount(long wordCount) {
        this.wordCount = wordCount;
    }
}
