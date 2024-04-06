package Library;

public abstract class Item {
    protected String title; // Title of the item
    protected int catalogueID; // Unique ID of the item in the library catalogue
    protected boolean availability; // Whether the item is available

    public void checkIn() {
        // Check the item into the library catalogue
        availability = true;
    }

    public void checkOut() {
        // Check the item out of the library catalogue
        availability = false;
    }

    public boolean isAvailable() {
        return availability;
    }

    public abstract String getDescription();
}
