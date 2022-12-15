import javax.xml.namespace.QName;

public class Book {
    private String bookName;
    private int bookYear;

    public Book(String bookName, int bookYear) {
        this.bookName = bookName;
        this.bookYear = bookYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookYear() {
        return this.bookYear;
    }

}
