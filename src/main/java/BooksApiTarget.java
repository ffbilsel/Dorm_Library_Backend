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
        if (!title.equals("")){
            stringBuilder.append("intitle:").append(title);
        }
        if (!author.equals(""))
            stringBuilder.append("+inauthor:").append(author);
        if (!ISBN.equals(""))
            stringBuilder.append("+isbn:").append(ISBN);
        return stringBuilder.toString();
    }

}
