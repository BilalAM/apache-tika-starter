package tikka.core.abstractDocuments;

public class AbstractDocument implements Document {
        private String createdAt;
        private String creator;
        private String comments;
        private String createdTool;
        private String description;
        private String type;
        private String format;
        private String modifiedAt;
        private String modifiedBy;

        public String getCreatedAt() {
                return createdAt;
        }

        public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
        }

        public String getCreator() {
                return creator;
        }

        public void setCreator(String creator) {
                this.creator = creator;
        }

        public String getComments() {
                return comments;
        }

        public void setComments(String comments) {
                this.comments = comments;
        }

        public String getCreatedTool() {
                return createdTool;
        }

        public void setCreatedTool(String createdTool) {
                this.createdTool = createdTool;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public String getFormat() {
                return format;
        }

        public void setFormat(String format) {
                this.format = format;
        }

        public String getModifiedAt() {
                return modifiedAt;
        }

        public void setModifiedAt(String modifiedAt) {
                this.modifiedAt = modifiedAt;
        }

        public String getModifiedBy() {
                return modifiedBy;
        }

        public void setModifiedBy(String modifiedBy) {
                this.modifiedBy = modifiedBy;
        }
}
