public class Book extends LibraryItem implements Borrowable {
    private String author;
    private String isbn;
    private boolean available;

    public Book(String id, String title, String author, String isbn) {
        super(id, title);
        this.author = author;
        this.isbn = isbn;
        this.available = true; // Initially available
    }

    @Override
    public String getDetails() {
        return "Book - " + super.toString() + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + available;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void borrow() {
        if (available) {
            available = false;
            System.out.println("You have borrowed the book: " + title);
        } else {
            System.out.println("Book is not available.");
        }
    }

    @Override
    public void returnItem() {
        available = true;
        System.out.println("You have returned the book: " + title);
    }
}