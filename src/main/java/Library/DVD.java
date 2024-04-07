package Library;

public class DVD extends Item implements Borrowable {
    private final String director; // Director of the DVD
    private final Rating rating; // Rating of the DVD

    public DVD(int catalogueID, String title, String director, Rating rating) {
        this.catalogueID = catalogueID;
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String describe() {
        return "DVD: " + this.title + " by " + this.director + " (catalogue ID " + this.catalogueID + ")";
    }

    @Override
    public boolean borrowItem(Member member) {
        // The given member borrows this item
        // Check if the DVD is available
        if (!this.availability) {
            return false;
        }

        // Check movie rating against the member's age
        System.out.println("Member's age: " + member.getAge());
        System.out.println("Movie rating: " + this.rating);
        if (
                (this.rating == Rating.R && member.getAge() < 18)
                        || (this.rating == Rating.MA && member.getAge() < 15)
        ) {
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
