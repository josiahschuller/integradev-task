package Library;

import Util.Describable;

public abstract class Item implements Describable {
    protected int catalogueID; // Unique ID of the item in the library catalogue
    protected String title; // Title of the item
    protected boolean availability; // Whether the item is available

    public Item() {
        this.availability = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return availability;
    }
}
