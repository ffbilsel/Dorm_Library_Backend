public class BooksApiResult {
    private String id;
    private String selfLink;
    private VolumeInfo volumeInfo;

    public void setId(String id) {
        this.id = id;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    public String getId() {
        return id;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }


    private static class VolumeInfo{

        private String title;
        private String[] authors;
        private String publisher;
        private String publishedDate;
        private String description;
        private String[] categories;
        private ImageLinks imageLinks;
        private String language;
        private ISBN[] industryIdentifiers;
        private String pageCount;

        public void setLanguage(String language) {
        this.language = language;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthors(String[] authors) {
            this.authors = authors;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public void setPublishedDate(String publishedDate) {
            this.publishedDate = publishedDate;
        }

        public void setMainCategory(String[] categories) {
            this.categories = categories;
        }

        public void setImageLinks(ImageLinks imageLinks) {
            this.imageLinks = imageLinks;
        }

        public String getTitle() {
            return title;
        }

        public String[] getAuthors() {
            return authors;
        }

        public String getPublisher() {
            return publisher;
        }

        public String getPublishedDate() {
            return publishedDate;
        }

        public String[] getCategories() {
            return categories;
        }

        public void setCategories(String[] categories) {
            this.categories = categories;
        }

        public ImageLinks getImageLinks() {
            return imageLinks;
        }

        public String getLanguage() {
            return language;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }


        public String getPageCount() {
            return pageCount;
        }

        public void setPageCount(String pageCount) {
            this.pageCount = pageCount;
        }

        private static class ImageLinks{
            private String thumbnail;

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }
        }

        private class ISBN{

            private String type;
            private String identifier;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getIdentifier() {
                return identifier;
            }

            public void setIdentifier(String identifier) {
                this.identifier = identifier;
            }
        }

    }

}
