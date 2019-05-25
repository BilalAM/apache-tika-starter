package tikka.core.abstractDocuments;

public class WordDocument extends AbstractDocument {

        private long characterCount;
        private String lastPrintedDate;
        private String lastSavedDate;
        private int pageCount;
        private long wordCount;
        private int imagesCount;
        private int paragraphsCount;
        private long linesCount;

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

        public long getCharacterCount() {
                return characterCount;
        }

        public void setCharacterCount(long characterCount) {
                this.characterCount = characterCount;
        }

        public int getImagesCount() {
                return imagesCount;
        }

        public void setImagesCount(int imagesCount) {
                this.imagesCount = imagesCount;
        }

        public int getParagraphsCount() {
                return paragraphsCount;
        }

        public void setParagraphsCount(int paragraphsCount) {
                this.paragraphsCount = paragraphsCount;
        }

        public long getLinesCount() {
                return linesCount;
        }

        public void setLinesCount(long linesCount) {
                this.linesCount = linesCount;
        }
}

