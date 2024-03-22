public class Book {

    private String title;
    private final Author author;
    private int yearOfPublishing;

    public Book(String title, Author author, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Книга " + title + ". " + author + ", год издания " + yearOfPublishing;
    }

    @Override
    public boolean equals(Object otherBook) {
        if (this.getClass() != otherBook.getClass()) {
            return false;
        }
        Book book = (Book) otherBook;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title);
    }

}
