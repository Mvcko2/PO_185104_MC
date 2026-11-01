public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{title='%s', author='%s', publicationYear=%d}".formatted(this.title, this.author, this.publicationYear);
    }
}