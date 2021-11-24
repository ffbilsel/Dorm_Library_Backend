public class BooksApiTarget {

    private final String title;
    private String author = "";
    private String ISBN = "";

    public BooksApiTarget(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getQuery() {
        StringBuilder stringBuilder = new StringBuilder("q=intitle:" + title);
        if (!author.equals(""))
            stringBuilder.append("+inauthor:").append(author);
        if (!ISBN.equals(""))
            stringBuilder.append("+isbn:").append(ISBN);
        return stringBuilder.toString();
    }

}
