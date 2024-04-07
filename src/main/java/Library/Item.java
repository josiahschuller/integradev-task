package Library;

public abstract class Item {
    protected int catalogueID; // Unique ID of the item in the library catalogue
    protected String title; // Title of the item
    protected boolean availability; // Whether the item is available

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return availability;
    }

    public abstract String getDescription();
}
