public class BooksApiTarget {

    private String title = "";
    private String author = "";
    private String ISBN = "";

    public BooksApiTarget() {
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getQuery() {
        StringBuilder stringBuilder = new StringBuilder("q=");
        if (!title.replaceAll("\\s+","").equals(""))
            stringBuilder.append("intitle:").append(title);
        if (!author.replaceAll("\\s+","").equals(""))
            stringBuilder.append("+inauthor:").append(author);
        if (!ISBN.replaceAll("\\s+","").equals(""))
            stringBuilder.append("+isbn:").append(ISBN);
        return stringBuilder.toString();
    }

}
