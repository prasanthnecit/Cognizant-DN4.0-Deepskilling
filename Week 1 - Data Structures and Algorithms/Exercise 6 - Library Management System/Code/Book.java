public class Book {
    private String bookId;
    private String title;
    private String author;

    public Book(String var1, String var2, String var3) {
        this.bookId = var1;
        this.title = var2;
        this.author = var3;
    }

    public String getBookId() {
        return this.bookId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String toString() {
        return "Book [bookId=" + this.bookId + ", title=" + this.title + ", author=" + this.author + "]";
    }
}
