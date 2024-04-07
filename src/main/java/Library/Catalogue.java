package Library;

import java.util.ArrayList;

public class Catalogue {
    private ArrayList<Item> items; // List of items in the library catalogue

    public Catalogue() {
        items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        // Add an item to the library catalogue
        items.add(item);
    }

    public void removeItem(Item item) {
        // Remove an item from the library catalogue
        items.remove(item);
    }

    public Item findItemByTitle(String title) {
        // Find an item in the library catalogue by its catalogue ID
        for (Item item : items) {
            if (item.getTitle().toLowerCase().equals(title.toLowerCase())) {
                return item;
            }
        }
        return null;
    }
}
