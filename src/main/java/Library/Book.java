package Library;

public class Book extends Item implements Borrowable {
    private final String author; // Author of the book

    public Book(int catalogueID, String title, String author) {
        this.catalogueID = catalogueID;
        this.title = title;
        this.author = author;
    }

    @Override
    public String describe() {
        return "Book: " + title + " by " + author + " (catalogue ID " + catalogueID + ")";
    }

    @Override
    public boolean borrowItem(Member member) {
        // The given member borrows this item
        // Check the book's availability
        if (!this.availability) {
            return false;
        }

        // Successfully borrowed
        member.addBorrowedItem(this);
        this.availability = false;
        return true;
    }

    @Override
    public boolean returnItem(Member member) {
        // The given member returns this item
        member.removeBorrowedItem(this);
        this.availability = true;
        return true;
    }
}
