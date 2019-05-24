package tikka.core.abstractDocuments;



public class WordDocument implements Document {
    private String author;
    private String applicationName;
    private String resourceName;
    private long characterCount;
    private long contentLength;
    private String creationDate;
    private String lastModifiedDate;
    private String lastPrintedDate;
    private String lastSavedDate;
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

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastPrintedDate() {
        return lastPrintedDate;
    }

    public void setLastPrintedDate(String lastPrintedDate) {
        this.lastPrintedDate = lastPrintedDate;
    }

    public String getLastSavedDate() {
        return lastSavedDate;
    }

    public void setLastSavedDate(String lastSavedDate) {
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

