public class Main {
    public static void main(String[] args) {

        Book firstBook = new Book("Galapagos", 1985);
        Book secondBook = new Book("The Catcher in the Rye", 1951);
        Author firstAuthor = new Author("Jerome David Salinger");
        Author secondAuthor = new Author( "Kurt Vonnegut Jr.");
        System.out.println("firstBook.getBookName() = " + firstBook.getBookName());
        System.out.println("firstBook.getBookYear() = " + firstBook.getBookYear());
        System.out.println("firstAuthor.getAuthorName() = " + firstAuthor.getAuthorName());
        System.out.println("secondBook.getBookName() = " + secondBook.getBookName());
        System.out.println("secondBook.getBookYear() = " + secondBook.getBookYear());
        System.out.println("secondAuthor.getAuthorName() = " + secondAuthor.getAuthorName());
    }
}