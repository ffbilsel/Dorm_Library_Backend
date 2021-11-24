public class BooksApiResult {
    private String id;
    private String selfLink;
    private VolumeInfo volumeInfo;

//TODO https://askandroidquestions.com/2021/09/17/google-books-api-returning-unexpected-thumbnail-url/ thumbnail link is broken for some reason
//TODO check empty fields

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
        private String[] categories;
        private ImageLinks imageLinks;
        private String language;

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

        public ImageLinks getImageLinks() {
            return imageLinks;
        }

        public String getLanguage() {
            return language;
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
    }

}
